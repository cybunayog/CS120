import java.util.Scanner;
public class CS220_Project1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int userGifts;
		String gift;
		String item;
		char cmd;
		int i;
		int j;
		//prompt user to input # of gifts
		do {
			System.out.println("Input number of gift items:");
			userGifts = sc.nextInt();
			if (userGifts <= 0) { 
				//if the inputted number is less than 0, an error will output
				System.out.println("ERROR: number of items must be greater than zero.");	
			}
		} while (userGifts < 1); //only while userGifts is greater than 1
		sc.nextLine(); //inputting more than one variable

		int [] giftItems = new int [userGifts];

		String [] nameItems = new String [userGifts];


		for (i = 0; i < giftItems.length; i++) {
			boolean match = false;
			System.out.println("Input name of gift item " + (i + 1) + ": ");
			nameItems[i] = sc.nextLine();
			
			for (j = 0; j < i; j++) {
				if(nameItems[i].equals(nameItems[j])) {
					System.out.println("No duplicates!");
					match = true;
					break;
				}
			}
			if (match)
				i--;
		}
		do {
			System.out.println("---------------------");
			System.out.println("MENU");
			System.out.println("---------------------");
			System.out.println("(A)dd a gift item");
			System.out.println("(D)elete a gift item");
			System.out.println("(E)mpty basket");
			System.out.println("(S)how basket");
			System.out.println("(Q)uit");
			System.out.println("---------------------");

			System.out.println("Please enter command:");
			gift = sc.nextLine();
			cmd = gift.charAt(0);

			switch (cmd) {
			case 'A':
			case 'a':
				//add
				boolean itemGifts = false;
				System.out.println("Input gift item name: ");
				item = sc.nextLine();
				for (i = 0; i < nameItems.length; i++) {
					if(item.equals(nameItems[i])) {
						giftItems[i] += 1;
						itemGifts = true;
					}
				}
				if (itemGifts) {
					System.out.println("Item added.");
				} else {
					System.out.println("ERROR: " + item + " not found.");
				}
				break;
			case 'D':
			case 'd':
				//delete
				boolean found = false;
				System.out.println("Input gift item name: ");
				item = sc.nextLine();
				for(i=0;i<giftItems.length;i++) {
					if(item.equals(nameItems[i])) {
						giftItems[i]=giftItems[i]-1;
						if(giftItems[i] <= 0) {
							giftItems[i]= 0;
						}
						found = true;
					}
				}
				if(found) {
					System.out.println("Item deleted.");
				}
				else {
					System.out.println("ERROR: " + item +" not found.");
				}
				break;
			case 'E':
			case 'e':
				//empty basket
				for (i = 0; i < userGifts; i++) {
					giftItems[i] = 0;
				}
				System.out.println("Basket emptied.");
				break;
			case 'S':
			case 's':
				//show basket
				for (j = 0; j < nameItems.length; j++) {
					System.out.print((j + 1) + ") ");
					System.out.println(nameItems[j] + ": " + giftItems[j]);
				}
				break;
			case'q':
			case 'Q':
				//stop
				System.out.println("Program terminated.");
				break;
			default: 
				System.out.println("ERROR: Invalid command." );
				break;
			}
		} while (cmd != 'q' && cmd != 'Q' );
	}
}
