
public class House {
	private String location;
	private int value;
	private int numBedrooms;
	
	public House () {
		location = "Azusa";
		value = 100000;
		numBedrooms = 2;
	}
	
	public House (int aValue, String alocation, int aBedroom) {
		location = alocation;
		value = aValue;
		numBedrooms = aBedroom;
	}
	
	void setValue(int aValue){
		value = aValue;
	}
	
	int getValue() {	
		return value;
	}
	
	void setLocation(String alocation) {
		location = alocation;
	}
	
	String getLocation () {
		return location;
	}
	
	void setNumBedrooms (int aBedroom) {
		numBedrooms = aBedroom;
	}
	
	int getNumBedrooms () {
		return numBedrooms;
	}
	
	
}
