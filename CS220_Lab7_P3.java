import java.util.Scanner;
public class CS220_Lab7_P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCols = 0;
		int numRows= 0;
		//check rows
		while (true) {
			System.out.println("Input the number of rows: ");
			numRows = sc.nextInt();
			if(numRows > 0)
				break;
			System.out.println("That is not a positive integer.");
		}
		//check columns
		while (true) {
			System.out.println("Input the number of columns: ");
			numCols = sc.nextInt();
			if(numCols> 0 )  
				break;
			System.out.println("That is not a positive integer.");

		}
		//print first row
		System.out.print("*	|	");
		for(int i = 1; i <= numCols; i++) 
		{
			System.out.print(i + "\t");
		}
		//print dashes
		System.out.println();
		int dash = (numCols + 1);
		for(int j = 0; j <= dash; ++j) 
		{
			System.out.print("--------");
		}
		//start printing rows
		System.out.println();
		for(int l = 1; l <= numRows; ++l) 
		{
			System.out.print(l + "\t" + "|" + "\t");

			for(int k = 1; k <= numCols; k++) 
			{
				int mult = l * k;
				System.out.print(mult + "\t");
			}
			System.out.println();


		}
	}
}






