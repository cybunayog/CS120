import java.util.Scanner;
public class Midterm {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		String name;
		String command;
		int numChild;
		int star;
		int i;
		int j;
		//PART 1
		do {
			System.out.println("Input number of children:");
			numChild = s.nextInt();
			if (numChild <= 0) {
				System.out.println("ERROR: number of children must be positive.");
			}
		}while (numChild < 1);
		s.nextLine();
		//PART 2
		int [] stars = new int [numChild];
		String [] childNames = new String [numChild];
		//PART 3
		for (i = 0; i < stars.length; i++) {
			boolean match = false;
			System.out.println("Input name of child " + (i + 1) + ": ");
			childNames[i] = s.nextLine();
			for (j = 0; j < i; j++) {
				if (childNames[i].equals(childNames[j])) {
					System.out.println("ERROR: " + childNames[i] + " already used.");
					match = true;
					break;
				}

			}
			if (match)
				i--;
			//PART 4
		}
		char cmd;
		do {
			System.out.println("=======================");
			System.out.println("MENU");
			System.out.println("-----------------------");
			System.out.println("(A)dd stars to child");
			System.out.println("(L)ist children's stars");
			System.out.println("(R)edeem stars");
			System.out.println("(Q)uit");
			System.out.println("=======================");
			//PART 5
			System.out.println("Please enter command:");
			command = s.next();
			cmd = command.charAt(0);

			switch(cmd) {
			case 'a':
			case 'A':
				//PART 6
				System.out.println("Input name:");
				name = s.next();
				for (i = 0; i < childNames.length; i++) {
					if (name.equalsIgnoreCase(childNames[i])) {
						break;
					}
				}

				if (!(i < childNames.length)) {
					System.out.println("ERROR:" + name + " not found.");
					break;
				} else {
					System.out.println("Input stars:");
					star = s.nextInt();
					if (star <= 0) {
						System.out.println("ERROR: " + star + " less than zero.");
						break;
					}
				}

				for (i = 0; i < childNames.length; i++) {
					if (name.equalsIgnoreCase(childNames[i])) {
						break;
					}
				}
				
				if (i < childNames.length) {
					stars[i] = star;
					System.out.println(star + " star(s) added.");
				}

				break;
			case 'l':
			case 'L':
				//PART 7
				for(i = 0; i < stars.length; i++) {
					System.out.println((i + 1) + ") " + childNames[i] + ": " + stars[i]);
				}
				break;
			case 'r':
			case 'R':
				//PART 8
				for(i = 0; i < stars.length; i ++) {
					stars[i] = 0;
				}
				System.out.println("Stars redeemed.");
				break;
			case 'q':
			case 'Q':
				//PART 9
				System.out.println("Program terminated.");
				break;
			default:
				//PART 10
				System.out.println("ERROR: Invalid command.");
				break;
			}
		} while(cmd != 'q' && cmd != 'Q');
	}

}
