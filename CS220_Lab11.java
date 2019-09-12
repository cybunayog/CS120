import java.text.DecimalFormat;

public class CS220_Lab11 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("$#, ##0");
		House defaultHouse = new House();
		
		System.out.println("This house is in " + defaultHouse.getLocation() + ", is worth " + df.format(defaultHouse.getValue()) + "and has " + defaultHouse.getNumBedrooms() + " bedrooms.");
		System.out.println();
		
		House bigHouse = new House(1400000, "Pasadena", 6);
		
		System.out.println("This house is in " + bigHouse.getLocation() + ", is worth " + df.format(bigHouse.getValue()) + "and has " + bigHouse.getNumBedrooms() + " bedrooms.");
		System.out.println("Before modifying big house using setters:");
		System.out.println("Big house value: " + df.format(bigHouse.getValue()));
		System.out.println("Big house location: " + bigHouse.getLocation());
		System.out.println("Big house bedrooms: " + bigHouse.getNumBedrooms());
		
		bigHouse.setValue(3200000);
		bigHouse.setLocation("Hollywood");
		bigHouse.setNumBedrooms(14);
		
		System.out.println();
		System.out.println("After modifying big house using setters:");
		System.out.println("Big house value: " + df.format(bigHouse.getValue()));
		System.out.println("Big house location: " + bigHouse.getLocation());
		System.out.println("Big house bedrooms: " + bigHouse.getNumBedrooms());
		
		if (defaultHouse.getLocation() != bigHouse.getLocation() && defaultHouse.getValue() != bigHouse.getValue() && defaultHouse.getNumBedrooms() != bigHouse.getNumBedrooms()) {
			System.out.println("\n" + "The default house and big house are DIFFERENT houses!");
		}
		
		House identicalBigHouse = new House(3200000, "Hollywood", 14);
		if (identicalBigHouse.getLocation() == bigHouse.getLocation() && identicalBigHouse.getLocation() == bigHouse.getLocation() && identicalBigHouse.getNumBedrooms() == bigHouse.getNumBedrooms()) {
			System.out.print("\n" + "The identical big house and big house are the SAME houses!");
		}
	}

}
