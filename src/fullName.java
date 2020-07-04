
public class fullName {
	
	public static void main(String[] args) {
		
		String firstName = "Rocky";
		String lastName = "Balboa";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
	}

	private static String createFullName(String firstName, String lastName) {
		String fullName = firstName+ " " +lastName;
		return fullName;
	}

}
