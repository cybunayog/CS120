import java.util.Scanner;
public class CS220_Lab3_P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int shortestWordLength = 0, longestWordLength = 0, averageWordLength = 0;
		
		System.out.println("Please enter three words (on a single line) and hit enter:");
		String userI = sc.next();
		String userLOVE = sc.next();
		String userPROGRM = sc.next();
		
		averageWordLength = ((userI.length() + userLOVE.length() + userPROGRM.length()) / 3);
		
		System.out.println(userI + " " + userLOVE + " " + userPROGRM);
	
		System.out.println("The word \'" + userI + "\' is " + userI.length() + " character(s) long.");
		System.out.println("The word \'" + userLOVE + "\' is " + userLOVE.length() + " character(s) long.");
		System.out.println("The word \'" + userPROGRM + "\' is " + userPROGRM.length() + " character(s) long.\n");
		
		if(userI.length() > userLOVE.length()) {
			longestWordLength = userI.length();
			shortestWordLength = userLOVE.length();
		} else if (userI.length() < userLOVE.length()) {
			shortestWordLength = userI.length();
			longestWordLength = userLOVE.length();
		}  
		if(userPROGRM.length() > longestWordLength) {
			longestWordLength = userPROGRM.length();
		} else if(userPROGRM.length() < shortestWordLength) {
			shortestWordLength = userPROGRM.length();
		}
		
		System.out.println("The shortest word is " + shortestWordLength + " character(s) long.");
		System.out.println("The longest word is " + longestWordLength + " character(s) long.");
		System.out.println("The average word length is " + averageWordLength + " character(s) long.");
		
	}

}
