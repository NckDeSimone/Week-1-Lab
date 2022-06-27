
public class Lab1 {

	public static void main(String[] args) {
		
		int availablePlaneSeats = 25;
		double costOfGroceries = 25.23;
		char middleInitial = 'W';
		boolean isHotOutside = false;
		String customerFirstName = "Nicholas ";
		String streetAddress = "1 Coburn Woods";
		
		//System.out.println("Number of available seats left on the plane: " + availablePlaneSeats);
		//System.out.println("Cost Of Groceries: $" + costOfGroceries);
		//System.out.println("The person's middle initial is " + middleInitial);
		//System.out.println("Is it hot outside - " + isHotOutside);
		//System.out.println("The customer's first name is " + customerFirstName);
		//System.out.println("Your street address is " + streetAddress);
		
		//availablePlaneSeats = availablePlaneSeats - 2;
		availablePlaneSeats -= 2;
		//costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries += 2.15;
		middleInitial = 'C';
		//isHotOutside = true;
		isHotOutside = !isHotOutside;
		String fullName = customerFirstName + middleInitial + " DeSimone";
		
		
		System.out.println("Number of available seats left on the plane: " + availablePlaneSeats);
		System.out.println("Cost Of Groceries: $" + costOfGroceries);
		System.out.println("The person's middle initial is " + middleInitial);
		System.out.println("Is it hot outside - " + isHotOutside);
		System.out.println("The customer's name is " + fullName + " and they live at " + streetAddress + ".");
		

	}

}
