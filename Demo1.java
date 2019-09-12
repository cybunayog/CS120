import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// First classroom demo
		
		Scanner sc = new Scanner(System.in); //takes a bunch of keys from the keyboard and converts to a number.

		int numStudents; //Variable
		
/*		numStudents = 5;
		
		System.out.println("Initial student population: " + numStudents);
*/		
		System.out.print("Input number of students: "); //Prompting user to input any number
		numStudents = sc.nextInt();
		
		int numAdded; //Another variable
		
/*		numAdded = 2;
		
		System.out.println(numAdded + " students added.");
*/		
		
		
		System.out.print("Input number to be added: "); //Prompting user to input any number
		numAdded = sc.nextInt();
		
		
		numStudents = numStudents + numAdded; //Adding two variables
		
		System.out.println("Now there are " + numStudents + " in the class.");

	}

}
