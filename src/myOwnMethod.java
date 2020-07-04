
public class myOwnMethod {
	
	public static void main(String[] args) {
		
		//Establish method to help determine if I will go for a run outside
		//I will go for run outside if I wake up before 6am
		//and the temperature outside is below 90 degrees
		
		boolean wakeBefore6a = true;
		int outdoorTemp = 87;
		
		boolean willRunOutside = willRunOutside(wakeBefore6a, outdoorTemp);
		System.out.println("I should run today: " +willRunOutside);
		
	}

	private static boolean willRunOutside(boolean wakeBefore6a, int outdoorTemp) {
		return wakeBefore6a && outdoorTemp < 90;
	}
}
