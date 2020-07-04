
public class methodMax {
	
	public static void main(String[] args) {
		
		//Write a method that takes an array of int and returns true
		//if the sum of all the ints in the array is greater than 100.
		
		int[] numbers = {3, 5, 9, 13, 16, 19, 23, 27};
		int max = 100;
		
		boolean isGreater = arrayGreaterThan(numbers, max);
		System.out.println(isGreater);
	}

	private static boolean arrayGreaterThan(int[] numbers, int max) {
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		return sum > max;
		
	}
}
