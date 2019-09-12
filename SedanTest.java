import java.util.*;


public class SedanTest {

	static double readNNegDouble(String s, Scanner sc) {
		{
			while(true) {
				System.out.println(s);
				double yeh = sc.nextDouble(); //setting a value
				if(yeh > 0) { //the value is greater than zero, return that value
					return yeh;
				}
				System.err.println("ERROR - input a non-negative number"); // or else it will print this error
			}
		}
	}

	static void printMenu(Sedan car2) { //prints the menu
			System.out.println("---------------------");
			System.out.println("MENU");
			System.out.println("---------------------");
			System.out.println("(D)rive");
			System.out.println("(P)ump fuel");
			System.out.println("Pump (U)p");
			System.out.println("Change (E)PA");
			System.out.println("Sedan (S)tats");
			System.out.println("(Q)uit");
			System.out.println("---------------------");
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sedan carz = new Sedan(10.0, 25.0); //constructor values
		System.out.println("Sedan 1");
		System.out.println("Sedan 1 created.");
		System.out.println(carz.toString()); //printing what's in carz
		System.out.print("\n");
		System.out.println("Sedan 2");
		double tankInput = readNNegDouble("Enter tank capacity:", sc); //entering in values
		double mpgInput = readNNegDouble("Enter MPG:", sc); //entering in values

		Sedan car2 = new Sedan(tankInput, mpgInput); //setting a new Sedan, the (tankInput, mpgInput) are referred from the constructor.

		System.out.println(car2.toString()); //printing what's in .toString(), connected by car2 from Sedan car2 = new Sedan(miles, EPA);		
		System.out.println("Sedan 2 created.");
		String command;
		char cmd;
		do {
			printMenu(car2); //from printMenu class, connects with the car2 constructor
			command = sc.next();
			System.out.println(command);
			cmd = command.charAt(0);

			switch(cmd) {
			case 'd':
				System.out.println("Enter miles:");
				double inputMiles = sc.nextDouble();
				car2.drive(inputMiles); //calls in the .drive method in which the inputMiles goes through

				break;
			case 'p':
				System.out.println("Enter gallons:");
				double inputGal = sc.nextDouble();
				car2.pumpFuel(inputGal); //calls in the .pumpFuel method in which the inputGal goes through
				break;
			case 'u':
				car2.pumpFuel(); //calls .pumpFuel
				break;
			case 'e':
				System.out.println("Enter EPA mpg:");
				double epaMPG = sc.nextDouble();
				boolean a = Sedan.setEPA(epaMPG); //calls the Sedan.setEPA method in which the epaMPG goes through
				break;
			case 's':
				System.out.println(car2.toString()); //calls car2.toString() to print when prompted
				break;
			case 'q':
				System.out.println("Program Terminated.");
				break;
			default:
				System.out.println("ERROR - invalid command.");
				break;
			}
		} while (cmd != 'q' && cmd != 'Q');

	}
}
