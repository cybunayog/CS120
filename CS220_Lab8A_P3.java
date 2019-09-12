import java.util.Scanner;
public class CS220_Lab8A_P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numVals = 0;

		do {
			System.out.println("Input the number of elements (2 ~ 50):");
			numVals = sc.nextInt();

		} while(!(numVals >= 2) || !(numVals < 50)); //between 2 ~ 50

		int [] fib = new int[numVals];
		//two elements to add one
		fib [0] = 0;
		fib [1] = 1;

		System.out.print(fib[0] + ", " + fib[1] + ", ");

		for(int i = 2; i < fib.length; i++) {
			fib[i] = fib[i -1] + fib[i -2];
			if ( i != fib.length - 1) 
				System.out.print(fib[i] + ", ");
			else 
				System.out.print(fib[i]);
			if (i % 10 == 0) {
				System.out.print("\n");
			}
		}
		System.out.print("\n");
	}
}

