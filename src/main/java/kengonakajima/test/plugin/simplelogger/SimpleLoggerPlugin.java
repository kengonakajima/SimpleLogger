package kengonakajima.test.plugin.simplelogger;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;
import java.util.Iterator;
import org.bukkit.*;//World;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.*;//Item;
import org.bukkit.event.*;//Listener;
import org.bukkit.event.block.*;//BlockBreakEvent;
import org.bukkit.event.entity.*;//EntityDamageEvent;
import org.bukkit.event.player.*;//PlayerMoveEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.inventory.*;//Inventory;


public class SimpleLoggerPlugin extends JavaPlugin {
	public String lastDeathJSONPart="";

    @Override
    public void onEnable() {
        getLogger().info("SimpleLogger: onEnable");

    	MyListener l=new MyListener();
    	l.setPlugin(this);    	
        getServer().getPluginManager().registerEvents(l, this);
    }
    @Override
    public void onDisable() {
        getLogger().info("SimpleLogger: onDisable");
    }
}

class MyListener implements Listener {
	SimpleLoggerPlugin plugin;
	
	public void setPlugin(SimpleLoggerPlugin p) {plugin=p;}
	
	Roman2Kana r2k=new Roman2Kana();

	int movecounter;
	@EventHandler
	public void onPlayerMove(final PlayerMoveEvent event) {
	    final Location from = event.getFrom();
	    final Location to = event.getTo();
	    if(from.getBlockX()!=to.getBlockX() || from.getBlockY()!=to.getBlockY() || from.getBlockZ()!=to.getBlockZ()) {
			movecounter++;
			if(movecounter%10==0) {
				logPosition(event.getPlayer(),to,"move " + to.getBlock().getType());
			}
		}
	}
	public void logPosition(Player p, Location loc, String tag) {
		plugin.getLogger().info(p.getName()+" ("+loc.getWorld().getName()+","+loc.getBlockX()+","+loc.getBlockY()+","+loc.getBlockZ()+") "+tag);
	}
	@EventHandler 
	public void onChunkLoad(final ChunkLoadEvent event) {
		Chunk ck = event.getChunk();
	}
	@EventHandler 
	public void onPlayerJoin(final PlayerJoinEvent event) {
		Player p=event.getPlayer();
		logPosition(p,p.getLocation(),"join");
	}
	@EventHandler
	public void onPlayerChat(final AsyncPlayerChatEvent event) { 
		String kana = r2k.convert(event.getMessage());
		if(kana!=null) {
			event.setMessage(kana);
		}
		Player p=event.getPlayer();
		logPosition(p,p.getLocation(),"chat");
	}

	@EventHandler
	public void onBlockBreak(final BlockBreakEvent event) {
        Player p = event.getPlayer();
        Block b = event.getBlock();
        logPosition(p,b.getLocation(),"block_break " + b.getType());
    }
	@EventHandler
    public void onBlockPlace(final BlockPlaceEvent event) {
        Player p = event.getPlayer();
        Block b = event.getBlock();
        logPosition(p,b.getLocation(),"block_place " + b.getType());
	}
	@EventHandler 
	public void onDeath(final PlayerDeathEvent event) { 		
		if (event.getEntity() != null && event.getEntity() instanceof Player) {
			Player p=(Player)event.getEntity();
			Location loc=p.getLocation();
			logPosition(p,loc,"death " + event.getDeathMessage());
		}		
	}
	@EventHandler
	public void onBedEnter(final PlayerBedEnterEvent event) { 
		Player p=event.getPlayer();
		logPosition(p,p.getLocation(),"enter_bed");
	}
	@EventHandler
	public void onPlayerStatisticIncrement(PlayerStatisticIncrementEvent event) { 
		if(event.getStatistic()==Statistic.TIME_SINCE_REST || event.getStatistic()==Statistic.TOTAL_WORLD_TIME )return;
		Player p=event.getPlayer();
		Material m=event.getMaterial();
		String matstr;
		if(m!=null) matstr=m.toString(); else matstr="null";
		logPosition(p,p.getLocation(),"statistics " + event.getStatistic()  + " " + matstr + " "+event.getNewValue());
	}
	@EventHandler 
	public void onPlayerRecipeDiscoverEvent(PlayerRecipeDiscoverEvent event) {
		NamespacedKey k=event.getRecipe();
		Recipe r=plugin.getServer().getRecipe(k);
		Player p=event.getPlayer();
		logPosition(p,p.getLocation(),"get_recipe " + k + " " + r );
	}
	@EventHandler 
	public void onPlayerInteract(PlayerInteractEvent event) {
		Block b=event.getClickedBlock();
		if(b!=null) {
			BlockState bs=b.getState();
			if(bs instanceof InventoryHolder ) {
				Location l=b.getLocation();
				logPosition(event.getPlayer(),l,"interact " + b.getType());
			}
		}
	}
}