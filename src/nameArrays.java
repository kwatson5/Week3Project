
public class nameArrays {

	public static void main(String[] args) {
		
		//Array of String called names
		
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//Sum of letters per name in array
		int num = 0;
		for(String name : names) {
			num += name.length();
		}
		
		//Average of number of letters per name in array
		double sum = 0;
		for(String name : names) {
			sum += name.length();
		}
			System.out.println("Average number of letters per name: " +sum / names.length);
			
		//Concantenate names in list
		String concatNames = "";
		for(String name : names) {
			concatNames = names[0]+ " "+names[1]+" "+names[2]+" "+names[3]+" "+names[4]+" "+names[5];
		}
			System.out.println("Concatenated names: " +concatNames);
			
		//Create a new array of int called nameLengths, loop & add length of each name array
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			String name = names[i];
			nameLengths[i] = name.length();
		}
		
		int totalNameLength = 0;
		for(int i = 0; i < nameLengths.length; i++) {
			totalNameLength += nameLengths[i];
		}
		System.out.println("Sum of elements in the array: " +totalNameLength);	
				
	}
}
