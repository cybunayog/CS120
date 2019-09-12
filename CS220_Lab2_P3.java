import java.util.Scanner;
public class CS220_Lab2_P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double carMiles;
		System.out.println("What is your car's miles per gallon: ");
		carMiles = sc.nextDouble();
		
		double tankSize;
		System.out.println("What is your car's tank size, in gallons: ");
		tankSize = sc.nextDouble();
		
		double gasTank;
		System.out.println("How many gallons of gas do you have in your tank: ");
		gasTank = sc.nextDouble();
		
		double DOLLARS_PER_GALLON;
		System.out.println("What is the price of gas, in dollars per gallon: ");
		DOLLARS_PER_GALLON = sc.nextDouble();
		
		
		System.out.print("Distance till empty: ");
		System.out.printf("%.2f", (carMiles * gasTank));
		System.out.println(" miles");
		
		System.out.print("Price to fill up tank: $");
		System.out.printf("%.2f", ((tankSize-gasTank) * DOLLARS_PER_GALLON));
	}

}
