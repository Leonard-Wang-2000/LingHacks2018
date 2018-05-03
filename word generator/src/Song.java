import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Song {
	String[] one = {"run", "life", "love", "world", "me", "one", "day", "you", "tip", "heart", "near", "far", "ace", "ring", "wolf", "man", "go", "fish", "king", "ice", "board", "bee", "green", "air", "have", "all", "sea", "ear", "death", "three", "out", "eye", "ant", "sing", "star", "ten", "rich", "age", "duck", "key", "dream", "lion", "red", "live", "pain", "laugh", "rain", "once", "ball", "fire", "with", "can", "cake", "sun", "care", "wood", "back", "faith", "own", "work", "self", "breath", "school", "mole", "ash", "less", "down", "land", "blue", "twelve", "safe", "iron"};
	String[][] two = {{"ba", "con"}, {"ap", "ple"}, {"tin", "foil"}, {"to", "night"}, {"key", "board"}, {"Jac", "ket"}, {"nin", "ja"}, {"hy", "per"}, {"ro", "tate"}, {"smo", "king"}, {"heart", "break"}, {"be", "ta"}, {"noo", "dle"}, {"doo", "dle"}, {"blon", "de"}, {"tur", "nip"}, {"to", "wel"}, {"ham", "mer"}, {"let", "ter"}, {"roc", "ket"}, {"lad", "der"}, {"din", "ner"}, {"sci", "ence"}, {"box", "er"}, {"pur", "ple"},{"per", "fect"}, {"sil", "ver"}, {"se", "ven"}, {"a", "bout"}, {"a", "gain"}, {"piz", "za"},{"do", "nate"}, {"prin", "cess"}, {"wa", "ter"}, {"fu", "ture"}, {"na", "ture"}, {"of", "fice"},{"par", "ty"}, {"ti", "ger"}, {"yel", "low"}, {"mon", "ster"}, {"ri", "ver"}, {"chal", "lenge"}, {"a", "way"}, {"bro", "ken"}, {"al", "ly"}, {"sun", "day"}, {"mo", "ment"}, {"or", "ange"}, {"fun", "ny"}};
	String[][] three = {{"mon", "i", "tor"}, {"Com", "pu", "ter"}, {"pro", "ce", "dure"}, {"de", "ci", "ded"}, {"ex", "am", "ple"}, {"di", "rect", "ly"}, {"im", "por", "tant"}, {"com", "plete", "ly"}, {"con", "si", "der"}, {"ad", "van", "tage"}, {"a", "gen", "da"}, {"mis", "tak", "en"}, {"e", "xact", "ly"}, {"nu", "tri", "tion"}, {"i", "con", "ic"}, {"fa", "mi", "ly"}, {"cho", "co", "late"}, {"hap", "pin", "ess"}, {"to", "ge", "ther"}, {"di", "a", "mond"}, {"me", "di", "a"}, {"for", "e", "ver"}, {"mas", "cu", "line"}, {"dan", "ger", "ous"}, {"re", "ven", "ge"}, {"har", "mo", "ny"}, {"pol", "lu", "tion"}, {"ra", "di", "o"}, {"me", "lo", "dy"}, {"im", "a", "gine"}, {"vi", "o", "lence"}, {"char", "ac", "ters"}, {"hon", "est", "ly"}, {"va", "nil", "la"}, {"ad", "jec", "tive"}, {"com", "pan", "y"}, {"pine", "ap", "ple"}, {"un", "de", "fined"}, {"ca", "mer", "a"}, {"un", "i", "form"}};
	private int syllables = 0;
	ArrayList <String> wordList = new ArrayList<String>();
	private String randomOne;
	private String[] randomTwo;
	private String[] randomThree;
	Random generator = new Random();
	
	public Song(int a){
		syllables = a;
	}
	//Uses the arraylist/array command to add each word based on get syllable methods
	public ArrayList<String> getWordList(){
		for(int i = 0; i < syllables; i++){
			String[] temp2;
			int temp = generator.nextInt(3);
			if(temp == 1){
				wordList.add(getOneSyllable());
			} else if(temp == 2){
				temp2 = getTwoSyllable();
				wordList.add(temp2[0]);
				wordList.add(temp2[1]);
			} else{
				temp2 = getThreeSyllable();
				wordList.add(temp2[0]);
				wordList.add(temp2[1]);
				wordList.add(temp2[2]);
			}
		}
		return wordList;
	}
	public String getOneSyllable(){
		randomOne = one[generator.nextInt(one.length)];
		return randomOne;
	}
	public String[] getTwoSyllable(){
		randomTwo = two[generator.nextInt(two.length)];
		return randomTwo;
	}
	public String[] getThreeSyllable(){
		randomThree = three[generator.nextInt(three.length)];
		return randomThree;
	}
}
