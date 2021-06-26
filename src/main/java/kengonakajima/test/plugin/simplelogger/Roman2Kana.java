package kengonakajima.test.plugin.simplelogger;

class DicEnt
{
	String roman;
	String kana;
	DicEnt(String r, String k) { 
		roman=r;
		kana=k;
	}
}


class Roman2Kana
{
	public DicEnt[] entries = new DicEnt[250];
	public void addEnt(String roman, String kana) { 
		for(int i=0;i<entries.length;i++) { 
			if(entries[i]==null) { 
				entries[i]=new DicEnt(roman,kana);
				return;
			}
		}
	}	

	public Roman2Kana() {		
		addEnt("kkya", "っきゃ");
		addEnt("kkyu", "っきゅ");
		addEnt("kkyo", "っきょ");
		addEnt("ssya", "っしゃ");
		addEnt("ssyu", "っしゅ");
		addEnt("ssyo", "っしょ");
		addEnt("ttya", "っちゃ");
		addEnt("ttyu", "っちゅ");
		addEnt("ttyo", "っちょ");
		addEnt("hhya", "っひゃ");
		addEnt("hhyu", "っひゅ");
		addEnt("hhyo", "っひょ");
		addEnt("mmya", "っみゃ");
		addEnt("mmyu", "っみゅ");
		addEnt("mmyo", "っみょ");
		addEnt("rrya", "っりゃ");
		addEnt("rryu", "っりゅ");
		addEnt("rryo", "っりょ");
		addEnt("ggya", "っぎゃ");
		addEnt("ggyu", "っぎゅ");
		addEnt("ggyo", "っぎょ");
		addEnt("zzya", "っじゃ");
		addEnt("zzyu", "っじゅ");
		addEnt("zzyo", "っじょ");
		addEnt("ddyu", "っぢゅ");
		addEnt("ddhu", "っぢゅ");
		addEnt("bbya", "っびゃ");
		addEnt("bbyu", "っびゅ");
		addEnt("bbyo", "っびょ");
		addEnt("ppya", "っぴゃ");
		addEnt("ppyu", "っぴゅ");
		addEnt("ppyo", "っぴょ");
		addEnt("ccha", "っちゃ");
		addEnt("cchi", "っち");
		addEnt("cchu", "っちゅ");
		addEnt("cche", "っちぇ");
		addEnt("ccho", "っちょ");
		addEnt("ttya", "っちゃ");
		addEnt("ttyu", "っちゅ");
		addEnt("ttyo", "っちょ");
		addEnt("shu", "しゅ");
		addEnt("kka", "っか");
		addEnt("kki", "っき");
		addEnt("kku", "っく");
		addEnt("kke", "っけ");
		addEnt("kko", "っこ");
		addEnt("ssa", "っさ");
		addEnt("ssi", "っし");
		addEnt("ssu", "っす");
		addEnt("sse", "っせ");
		addEnt("sso", "っそ");
		addEnt("tta", "った");
		addEnt("tti", "っち");
		addEnt("ttu", "っつ");
		addEnt("tte", "って");
		addEnt("tto", "っと");
		addEnt("hha", "っは");
		addEnt("hhi", "っひ");
		addEnt("hhu", "っふ");
		addEnt("hhe", "っへ");
		addEnt("hho", "っほ");
		addEnt("mma", "っま");
		addEnt("mmi", "っみ");
		addEnt("mmu", "っむ");
		addEnt("mme", "っめ");
		addEnt("mmo", "っも");
		addEnt("rra", "っら");
		addEnt("rri", "っり");
		addEnt("rru", "っる");
		addEnt("rre", "っれ");
		addEnt("rro", "っろ");
		addEnt("wwa", "っわ");
		addEnt("wwo", "っを");
		addEnt("gga", "っが");
		addEnt("ggi", "っぎ");
		addEnt("ggu", "っぐ");
		addEnt("gge", "っげ");
		addEnt("ggo", "っご");
		addEnt("zza", "っざ");
		addEnt("zzi", "っじ");
		addEnt("zzu", "っず");
		addEnt("zze", "っぜ");
		addEnt("zzo", "っぞ");
		addEnt("dda", "っだ");
		addEnt("ddi", "っぢ");
		addEnt("ddu", "っづ");
		addEnt("dde", "っで");
		addEnt("ddo", "っど");
		addEnt("bba", "っば");
		addEnt("bbi", "っび");
		addEnt("bbu", "っぶ");
		addEnt("bbe", "っべ");
		addEnt("bbo", "っぼ");
		addEnt("ppa", "っぱ");
		addEnt("ppi", "っぴ");
		addEnt("ppu", "っぷ");
		addEnt("ppe", "っぺ");
		addEnt("ppo", "っぽ");
		addEnt("kya", "きゃ");
		addEnt("kyu", "きゅ");
		addEnt("kyo", "きょ");
		addEnt("sya", "しゃ");
		addEnt("syu", "しゅ");
		addEnt("syo", "しょ");
		addEnt("tya", "ちゃ");
		addEnt("tyu", "ちゅ");
		addEnt("tyo", "ちょ");
		addEnt("nya", "にゃ");
		addEnt("nyu", "にゅ");
		addEnt("nyo", "にょ");
		addEnt("hya", "ひゃ");
		addEnt("hyu", "ひゅ");
		addEnt("hyo", "ひょ");
		addEnt("mya", "みゃ");
		addEnt("myu", "みゅ");
		addEnt("myo", "みょ");
		addEnt("rya", "りゃ");
		addEnt("ryu", "りゅ");
		addEnt("ryo", "りょ");
		addEnt("gya", "ぎゃ");
		addEnt("gyu", "ぎゅ");
		addEnt("gyo", "ぎょ");
		addEnt("zya", "じゃ");
		addEnt("zyu", "じゅ");
		addEnt("zyo", "じょ");
		addEnt("dyu", "ぢゅ");
		addEnt("dhu", "ぢゅ");
		addEnt("bya", "びゃ");
		addEnt("byu", "びゅ");
		addEnt("byo", "びょ");
		addEnt("pya", "ぴゃ");
		addEnt("pyu", "ぴゅ");
		addEnt("pyo", "ぴょ");
		addEnt("cha", "ちゃ");
		addEnt("chi", "ち");
		addEnt("chu", "ちゅ");
		addEnt("che", "ちぇ");
		addEnt("cho", "ちょ");
		addEnt("sha", "しゃ");
		addEnt("shi", "し");
		addEnt("shu", "しゅ");
		addEnt("she", "しぇ");
		addEnt("sho", "しょ");
		addEnt("dhi","でぃ");
		addEnt("dhe","でぇ");
		addEnt("ka", "か");
		addEnt("ki", "き");
		addEnt("ku", "く");
		addEnt("ke", "け");
		addEnt("ko", "こ");
		addEnt("sa", "さ");
		addEnt("si", "し");
		addEnt("su", "す");
		addEnt("se", "せ");
		addEnt("so", "そ");
		addEnt("ta", "た");
		addEnt("ti", "ち");
		addEnt("tu", "つ");
		addEnt("te", "て");
		addEnt("to", "と");
		addEnt("na", "な");
		addEnt("ni", "に");
		addEnt("nu", "ぬ");
		addEnt("ne", "ね");
		addEnt("no", "の");
		addEnt("ha", "は");
		addEnt("hi", "ひ");
		addEnt("hu", "ふ");
		addEnt("he", "へ");
		addEnt("ho", "ほ");
		addEnt("ma", "ま");
		addEnt("mi", "み");
		addEnt("mu", "む");
		addEnt("me", "め");
		addEnt("mo", "も");
		addEnt("ya", "や");
		addEnt("yu", "ゆ");
		addEnt("yo", "よ");
		addEnt("ra", "ら");
		addEnt("ri", "り");
		addEnt("ru", "る");
		addEnt("re", "れ");
		addEnt("ro", "ろ");
		addEnt("wa", "わ");
		addEnt("wi", "うぃ");
		addEnt("wu", "う");
		addEnt("we", "うぇ");
		addEnt("wo", "を");
		addEnt("nn", "ん");
		addEnt("ga", "が");
		addEnt("gi", "ぎ");
		addEnt("gu", "ぐ");
		addEnt("ge", "げ");
		addEnt("go", "ご");
		addEnt("za", "ざ");
		addEnt("zi", "じ");
		addEnt("zu", "ず");
		addEnt("ze", "ぜ");
		addEnt("zo", "ぞ");
		addEnt("ja", "じゃ");
		addEnt("ji", "じ");
		addEnt("ju", "じゅ");
		addEnt("je", "じぇ");
		addEnt("jo", "じょ");
		addEnt("da", "だ");
		addEnt("di", "ぢ");
		addEnt("du", "づ");
		addEnt("de", "で");
		addEnt("do", "ど");
		addEnt("ba", "ば");
		addEnt("bi", "び");
		addEnt("bu", "ぶ");
		addEnt("be", "べ");
		addEnt("bo", "ぼ");
		addEnt("pa", "ぱ");
		addEnt("pi", "ぴ");
		addEnt("pu", "ぷ");
		addEnt("pe", "ぺ");
		addEnt("po", "ぽ");
		addEnt("fa", "ふぁ");
		addEnt("fi", "ふぃ");
		addEnt("fu", "ふ");
		addEnt("fe", "ふぇ");
		addEnt("fo", "ふぉ");		
		addEnt("la", "ぁ");
		addEnt("li", "ぃ");
		addEnt("lu", "ぅ");
		addEnt("le", "ぇ");
		addEnt("lo", "ぉ");
		addEnt("xa", "ぁ");
		addEnt("xi", "ぃ");
		addEnt("xu", "ぅ");
		addEnt("xe", "ぇ");
		addEnt("xo", "ぉ");
		addEnt("a", "あ");
		addEnt("i", "い");
		addEnt("u", "う");
		addEnt("e", "え");
		addEnt("o", "お");
		addEnt("n", "ん");
	}
	public boolean isBoin(char ch) {
        if(Character.isAlphabetic(ch)) { 
        	if(ch=='a'||ch=='i'||ch=='u'||ch=='e'||ch=='o') return true;
        }	
        return false;
	}
	static char shiin[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};                                 

	public static boolean isShiin(char ch) { 
		for(int i=0;i<shiin.length;i++) { 
			if(ch==shiin[i]) return true;
		}
		return false;
	}
	public int needConvert(String msg) {
		if(msg.length()==0)return 0;
		char last_char = msg.charAt(msg.length()-1);
		if(isShiin(last_char) && last_char!='n') return -20; // 末尾が子音なら英語
		int n_space=0;
		int n_letter=0;
		int n_boin=0;
		int shiin_cont=0;
		int word_len_max=0;
		int word_len=0;
		boolean prev_n=false;
		boolean prev_shiin=false;
		char prev_ch=0;
	    for(int i=0;i < msg.length();i++) {
	        char ch = msg.charAt(i);
	        if(Character.isUpperCase(ch)) return -10; // 大文字があったら英語
	        if(ch==' ') n_space++; else n_letter++;  
	        if(ch==' ' && prev_shiin && prev_ch!='n') return -2;
	        if(isShiin(ch)) { 
	        	if(prev_ch!='n') shiin_cont++;
	        	prev_shiin=true;
	        } else { 
	        	shiin_cont=0;
	        	prev_shiin=false;
	        }
	        prev_ch=ch;
	        if(isBoin(ch)) n_boin++;
	        if(ch==' ') { 
	        	word_len=0;
	        } else { 
	        	word_len++;
	        	if(word_len>word_len_max)word_len_max=word_len;
	        }
	        if(shiin_cont>=3) return -3;
	    }
	    float boin_rate = (float)n_boin / (float)n_letter;
	    float space_rate = (float)n_space / (float)n_letter;
	    if(word_len_max>15) return 1;
	    if(n_space>6) return -4;
	    if(boin_rate>0.4) return 2;
	    if(space_rate>0.15) return -3;
	    return -5;			
	}
	public String convert(String msg) {
		int need=needConvert(msg);
		if(need<0) {
			return msg;		
		}

		for(int r=0;r<100;r++) {
			for(int i=0;i<entries.length;i++) {
				if(entries[i]==null)continue;
				if(entries[i].roman.length()>0) {
					msg=msg.replace(entries[i].roman, entries[i].kana);
				}
			}
		}
		return msg;		
	}
}