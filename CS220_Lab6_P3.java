import java.util.Scanner;
import java.text.DecimalFormat;
public class CS220_Lab6_P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double userVal = 1; 
		int calc = 0;
		double userSq;
		DecimalFormat df = new DecimalFormat (".000");

		System.out.println("Please enter a number greater than 10:");
		userVal = sc.nextDouble();

		while (userVal <  10.001) {
			System.out.println("Please enter a number greater than 10:");
			userVal = sc.nextDouble();
		}

		while (userVal >= 1.01) {
			userSq = Math.sqrt(userVal);
			System.out.println("The square root of " + df.format(userVal) + " is " + df.format(userSq));

			userVal = userSq;
			userVal = userSq;

			userSq = Math.sqrt(userVal);
			calc = calc + 1;

		}
		System.out.println("You performed " + calc + " square root operations.");
	}
}
