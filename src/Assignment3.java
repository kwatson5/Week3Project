
public class Assignment3 {
	public static void main(String[] args) {
		//Question 1
		
		int[] ages1 = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		int[] ages2 = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 47};
		
		System.out.println("Difference check for age group 1: " +calcAgeDif(ages1));
		System.out.println("Difference check for age group 2: " +calcAgeDif(ages2));
		System.out.println("Age group 1 average: " +calcAvgAge(ages1));
		System.out.println("Age group 2 average: " +calcAvgAge(ages2));
	}

//Subtract the first element from the last element
public static int calcAgeDif(int[] numbers) {
	int firstNum = numbers[0];
	int lastNum = numbers[numbers.length-1];
		return lastNum - firstNum;
}
	
//Calculate average age
public static int calcAvgAge(int[] numbers) {
	int sum = 0;
	for (int number : numbers) {
		sum += number;
	}
	return sum / numbers.length;
}

    }
