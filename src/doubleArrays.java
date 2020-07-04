
public class doubleArrays {
	
	public static void main(String[] args) {
		
		double[] scores1 = {85.3, 97.6, 72.4, 90.2, 88.8, 83.4};
		double[] scores2 = {75.2, 98.7, 90.5, 89.4, 65.7};
		double avg = calcAvgScore(scores1);
		System.out.println(avg);
		
		boolean scores1Greater = avgTwoArrays(scores1, scores2);
		System.out.println(scores1Greater);
	}

	//method that takes an array of double
	//and returns the average of all the elements in the array.
	
	public static double calcAvgScore(double[] numbers) {
		double total = 0.0;
		
		for(int i = 0; i < numbers.length; i++) {
		total += numbers[i];	
	}
		return total / numbers.length;
	}
	
		//method takes two arrays of double and returns
		//true if the average of the elements in the first array is
		//greater than the average of the elements in the second array.
	
	private static boolean avgTwoArrays(double[] scores1, double[] scores2) {
		double avg1 = calcAvgScore(scores1);
		double avg2 = calcAvgScore(scores2);
		
		return avg1 < avg2;
	}
}
