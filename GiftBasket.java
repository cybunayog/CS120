import java.util.*; //import anything boiii

public class GiftBasket {

	public static void main(String[] args) {
		ArrayList<GiftItem> basket = new ArrayList<GiftItem>();
		Scanner sc = new Scanner(System.in);
		char cmd;
		int i;

		do {
			System.out.println("Input name of gift item: ");
			String itemName = sc.next();
			if(itemName.equalsIgnoreCase("quit")) {
				break;
			} else {
				GiftItem item = new GiftItem(itemName, 0);
				basket.add(item);
			}

		}while(true);

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
			String command = sc.next();
			cmd = command.charAt(0);

			switch (cmd) {
			case 'A':
			case 'a':
				boolean itemGifts = false;
				System.out.println("Input gift item name: ");
				String items = sc.next();
				for (i = 0; i < basket.size(); i++) {
					if(items.equals(basket.get(i).getName())) { //its gonna run it however many times on the end variable, until it reaches the same value. Since you're comparing a String to a String-Value, you do .getName to compare a String to String from an array list. 
						GiftItem itemz = basket.get(i); //getting whatever it was on the array list, sending to the GiftItem file, and transfers back to add.
						itemz.addItem(); //calls to add
						itemGifts = true;
						break;
					}
				}
				if(itemGifts) {
					System.out.println("Item added.");
				} else {
					System.err.println("ERROR: " + items + " not found.");
				}
				break;
			case 'D':
			case 'd':
				boolean found = false;
				System.out.println("Input gift item name: ");
				String items1 = sc.next();
				for (i = 0; i < basket.size(); i++) {
					if(items1.equals(basket.get(i).getName())) { //its gonna run it however many times on the end variable, until it reaches the same value. Since you're comparing a String to a String-Value, you do .getName to compare a String to String from an array list. 
						GiftItem itemz = basket.get(i); //getting whatever it was on the array list, sending to the GiftItem file, and transfers back to add.
						itemz.deleteItem(); //calls to add
						found = true;
						break;
					}
				}
				if(found) {
				System.out.println("Item deleted.");
				} else {
				System.err.println("ERROR: " + items1 + " not found.");
				}
				break;
			case 'E':
			case 'e':
				for (i = 0; i < basket.size(); i++) {
					GiftItem itemz = basket.get(i);
					itemz.emptyItem();
				}
				System.out.println("Basket emptied.");
				break;
			case 'S':
			case 's':
				//show basket
				for (i = 0; i < basket.size(); i++) {
					GiftItem itemz = basket.get(i);
					System.out.println((i + 1) + ") " + itemz.toString());
				}
				break;
			case'q':
			case 'Q':
				//stop
				System.out.println("Program terminated.");
				break;
			default: 
				System.err.println("ERROR: Invalid command." );
				break;
			}
		} while (cmd != 'q' && cmd != 'Q' );
	}
}


