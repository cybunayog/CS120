
public class Sedan {
	 public static final int numWheels = 4;
	 public static final int numDoors = 4;
	 public static double tankCapacity;
	 public static double mpg;
	 private static double epaMPG = 25;
	 private double currFuelLevel;
	 private double mileage;
	 
	 public Sedan () {
		 //default constructor
		 tankCapacity = 10.0;
		 currFuelLevel = 10.0;
		 mpg = 25.0;
		 epaMPG = mpg;
		 mileage = 0.0;
	 }
	 
	 public Sedan (double ptankCapacity, double mpg) {
		 //constructor
		 Sedan.mpg = mpg; //from the Sedan class
		 tankCapacity = ptankCapacity;
		 currFuelLevel = ptankCapacity;
	 }
	 
	 public String toString() {
		 String temp;
		 if (mpg >= epaMPG) { //if the mpg is greater or equal to the epa. 
			 temp = "Sedan with " + numWheels + " wheels and " + numDoors + " doors," + "\n" +
					"with " + tankCapacity + " gallon fuel tank and " + currFuelLevel + " gallons fuel," + "\n" +
					"with " + mileage + " mileage," + "\n" +
					"and with " + mpg + " mpg meeting the EPA mpg of " + epaMPG + ".";
		 } else { //if not, print instead
			 temp = "Sedan with " + numWheels + " wheels and " + numDoors + " doors," + "\n" +
					 "with " + tankCapacity + " gallon fuel tank and " + currFuelLevel + " gallons fuel," + "\n" +
					 "with " + mileage + " mileage," + "\n" +					 
					 "and with " + mpg + " mpg not meeting the EPA mpg of " + epaMPG + ".";
		 }
		 return temp;
	 }
	 
	 public double drive(double miles) {
		 if(miles < mpg * currFuelLevel) { //if miles is less than the mpg * currFuelLevel.
			 System.out.println(miles + " actual miles driven.");
			 currFuelLevel = tankCapacity - (miles / mpg); 
			 mileage += miles;
			 return miles;
		 } else {
			 double max = mpg * currFuelLevel;
			 System.out.println(max + " actual miles driven.");
			 currFuelLevel = 0; //current fuel level is set to 0
			 mileage += max; //mileage = mileage + max;
			 return max; //returns value of max
		 }
	 }
	 
	 public double pumpFuel(double gallons) {
		 double now = tankCapacity - currFuelLevel;
		 if(now < gallons) { //if now is less than gallons
			 System.out.println(now + " actual gallons pumped.");
			 currFuelLevel += now; //currFuelLevel = currFuelLevel + now;
			 return now; //returns value of now
		 } else {
			 //if now < gallons is not true
			 System.out.println(gallons + " actual gallons pumped.");
			 currFuelLevel =+ gallons; //currFuelLevel = currFuelLevel + gallons;
			 return gallons; //returns value of gallons
		 }
	 }
	 
	 public double pumpFuel() {
		 currFuelLevel = tankCapacity;
		 System.out.println(currFuelLevel + " actual gallons pumped.");
		 return currFuelLevel; //returns value of currFuelLevel and prints ^
	 }
	 
	 public static boolean setEPA(double newEPAmpg) {
		 boolean truth = false;
		 if (epaMPG > 0) { //if epaMPG is greater than 0
			 truth = true; //reverts from false to truth
			 epaMPG = newEPAmpg; //the value of epaMPG is equal to newEPAmpg
			 System.out.println("EPA updated."); //prints
			 return truth; //returns to be true
		 } else {
			 return truth; //returns to be false, does not run
		 }
	 }
	 
	 double getEPA() {
		 return epaMPG; //returns value of epaMPG
	 }
	 
	 double getMileage() {
		 return mileage; //returns value of mileage
	 }
	 
	 double getFuel() {
		 return currFuelLevel; //returns value of currFuelLevel
	 }
	 
	 boolean equals() {
		 boolean truth = false;
		 return truth; //returns to be false
	 }
}
