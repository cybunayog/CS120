import java.util.Scanner;
public class CS220_Lab4_P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double tempF;
		double tempC;

		System.out.println("Please enter a temperature in Celcius.");
		tempC = sc.nextDouble();

		tempF = (((9.0/5.0) * tempC + 32.0));

		if (tempF >= 70.0) {
			System.out.println("It should be okay to wear shorts today.");
		} else if (tempF < 70.0) {
			System.out.println("You might think about wearing a jacket.");
		}

	}

}
