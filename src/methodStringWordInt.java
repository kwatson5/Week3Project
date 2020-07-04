
public class methodStringWordInt {
	
	public static void main(String[] args) {
		
		//method that takes a String, word, and an int, n, as arguments
		//and returns the word concatenated to itself n number of times.
		
		String words = concatenateWords("Run", 4);
		System.out.println(words);
	}

	private static String concatenateWords(String word, int numOfTimes) {
		String words = "";
		while(numOfTimes > 0) {
		words += word;
		numOfTimes -= 1;
		}
		return words;
		
	}
}
