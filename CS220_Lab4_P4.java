import java.util.Scanner;
public class CS220_Lab4_P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String userID;
		String userPASS;
		String samePASS;
																																																																																																																																																																																																																																																																																																																																																																	
		System.out.println("User ID:"); //take out for zybooks
		userID = sc.next();
		
		System.out.println("Password: ");  //branch 1
		userPASS = sc.next();
		
		System.out.println("Same password again: "); //branch 2
		samePASS = sc.next();
		
		if (userID.length() < 6) {
			System.out.println("Your User ID is too short");
		}	else if (userID.length() > 10) {
			System.out.println("Your User ID is too long");
		}	else if (userPASS.contains("&") ) {
			System.out.println("Your password may not have the '&' character");
		}	else if (samePASS.equals(userPASS)==false) {
			System.out.println("Your passwords do not match");
		}	else {
			System.out.println("Welcome " + userID);
		}
		

	
	}
}


