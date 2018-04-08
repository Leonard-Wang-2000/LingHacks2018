import java.util.*;
public class GenerateWords {

	public static void main(String[] args) {
		ArrayList<String> dictionary = new ArrayList<String>();
		int endGame = 50;
		Random generator = new Random();
		String[] one = {"the", "hi", "last", "night", "grew", "warm", "as", "could", "be", "when", "wish"};
		String[] two = {"contact", "actor", "artist", "asking", "bashful", "beside", "bigger", "blindness", "boldly", "booklet", "bossy", "breathless",};
		String randomOne = one[generator.nextInt(one.length)];
		String randomTwo = two[generator.nextInt(two.length)];
		System.out.println(randomOne);
		
	}
	
}
