
public class GiftItem {

	 private int itemQty;
	 private String itemName;
	 
	 public GiftItem() {
		 itemName = "none";
		 itemQty = 0;
	 }
	 
	 public GiftItem(String _itemName, int _itemQty) {
		 itemName = _itemName;
		 itemQty = _itemQty;
	 }
	 
	 String getName() {
		 return itemName;
	 }
	 
	 int getQty () {
		 return itemQty;
	 }
	 
	 void addItem() {
		 itemQty++;
	 }
	 
	 void deleteItem() {
		 if (itemQty > 0) {
			 itemQty--;
		 }
	 }
	 
	 void emptyItem() {
		 itemQty = 0;
	 }
	 
	 public String toString() {
		 String temp;
		 temp = itemName + ": " + itemQty;
		 return temp;
	 }
	
	 
}
