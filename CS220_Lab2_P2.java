import java.util.Scanner;
public class CS220_Lab2_P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double userInput;
		
		System.out.println("Please enter a temperature in Farenheit: ");
		userInput = sc.nextInt();
		System.out.println("Original temperature: " + (int)userInput + " degrees F.");
		
		double farCel;
		farCel = (5.0/9.0 * (userInput - 32.0)); //equation for farenheit to celcius
		System.out.println("Equivalent to: " + (int)farCel + " degrees C.");

		
		userInput = (((9.0/5.0) * farCel) + 32.0); //equation for converting back from celcius to farenheit from the original number
		System.out.println("Converted back: " + (int)userInput + " degrees F.");
	}

}
