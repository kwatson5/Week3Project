
public class buyDrink {
	
	public static void main(String[] args) {
		
		//method - willBuyDrink that takes a
		//boolean isHotOutside, and a double moneyInPocket,
		//and returns true if it is hot outside and if
		//moneyInPocket is greater than 10.50.
		
		boolean isHotOutside = true;
		double moneyInPocket = 11.75;
		
		boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println(willBuyDrink);
		
	}

	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}

}
