
public class Demo2 {
	public static void main(String[] args) {
		
		int numSecs;
		
		numSecs = 1000000;
		
		int numMins;
		int numHours;
		
		numMins = numSecs / 60;
		numSecs %= 60;					//remainder after 60
		
		numHours = numMins / 60;
		numMins %= 60;
		
		System.out.println(numHours + " hours, " + numMins + " minutes, " + numSecs + " seconds.");

	}

}
