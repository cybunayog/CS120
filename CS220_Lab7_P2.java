import java.util.Scanner;
public class CS220_Lab7_P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

		int i;
		int n;

		while(true) {
			System.out.println("Enter a positive integer: ");
			n = sc.nextInt();

			if (n>0)
				break;
			System.out.println("You entered a Non-Positive number.");

		}
		int factor = 1;
		for (i=1; i<=n; i++) {
			factor = factor*i;
		}
		System.out.println(factor);
	} 
}
