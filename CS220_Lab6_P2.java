   import java.util.Scanner;
public class CS220_Lab6_P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numVal;
		int n;
		n = 1;
		
		System.out.println("How many times would you like to print \"Hello World\" ? ");
		numVal = sc.nextInt();
		
		while (numVal >= n) {
			System.out.println("Hello World " + n);
			n++;
			
		}
		System.out.println("Goodbye.");
	}

}
