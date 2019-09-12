import java.util.Scanner;
public class CS220_Lab9_P3 {

	static Scanner s = new Scanner(System.in);
	static int numGifts;
	static String [] giftNames;
	static int [] qty;
	static String gift;
	static String item;

	public static void main(String[] args) {

		numGifts = enterGifts(numGifts);
		qty = new int[numGifts];
		giftNames = new String[numGifts];

		giftNames(gift);

		printMenu();


	}
	public static int enterGifts(int numGifts) {
		do {
			System.out.println("Input number of gift items: ");
			numGifts = s.nextInt();
			if (numGifts <=0) {
				System.out.println("ERROR: number of items must be greater than zero.");
			}

		}while (numGifts <= 0);
		s.nextLine();

		return numGifts;
	}

	public static void giftNames(String gift) {

		for (int i = 0; i < qty.length; i++) {
			System.out.println("Input name of gift item " + (i + 1) + ": ");
			giftNames[i] = s.nextLine();
		}
	}

	public static void printMenu() {
		String command;
		char cmd;
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
			System.out.println("Please enter a command");
			command = s.nextLine().toLowerCase();
			cmd = command.charAt(0);

			switch(cmd) {
			case 'a':
				addGifts();
				break;
			case 'd':
				deleteGifts();
				break;
			case 'e':
				emptyBasket();
				break;
			case 's':
				showBasket();
				break;
			case 'q':
				System.out.println("Program terminated.");
				break;
			default:
				System.out.println("ERROR: Invalid command.");
				break;
			}
		} while (cmd != 'q' && cmd != 'Q');
	}

	public static void deleteGifts() {

		boolean found = false;
		System.out.println("Input gift item name: ");
		item = s.nextLine();
		for(int i=0;i<giftNames.length;i++) {
			if(item.equals(giftNames[i])) {
				qty[i]=qty[i]-1;
				if(qty[i] <= 0) {
					qty[i]= 0;
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
	
	}

	public static void emptyBasket() {

		for (int i = 0; i < numGifts; i++) {
			qty[i] = 0;
		}
		System.out.println("Basket emptied.");


	}

	public static void showBasket() {

		for (int i = 0; i < giftNames.length; i++) {
			System.out.println((i + 1) + ") " + giftNames[i] + ": " + qty[i]);
		}
	}

	public static void addGifts() {

		boolean itemGifts = false;
		System.out.println("Input gift item name: ");
		item = s.nextLine();
		for (int i = 0; i < giftNames.length; i++) {
			if(item.equals(giftNames[i])) {
				qty[i] += 1;
				itemGifts = true;
			}
		}
		if (itemGifts) {
			System.out.println("Item added.");
		} else {
			System.out.println("ERROR: " + item + " not found.");
		}
	}
}
