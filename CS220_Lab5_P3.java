import java.util.Scanner;
public class CS220_Lab5_P3 {

	private static final Object Female = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isMale;
		char userChoice = 0;
		int weight;
		System.out.println("What is your sex?");
		String sex = sc.next();
		
		if (sex.equals("Male")) {
			isMale = true;
		} else {
			isMale = false;
		}
    
		System.out.println("Please enter your weight (in pounds):");
		weight = sc.nextInt();

	
			if((weight >= 185)&&(!isMale)) {
				System.out.println("You have been placed in the women's heavyweight class.");
				return;
			} else if (((weight >= 130) && (weight <= 185)) && (!isMale)) {
				System.out.println("You have been placed in the women's middleweight class.");
				return;
			} else if(((weight > 0) && (weight < 130))&& (!isMale)) {
				System.out.println("You have been placed in the women's lightweight class.");
				return;
			}
			if((weight >= 220) && (isMale)) {
				System.out.println("You have been placed in the men's heavyweight class.");
				return;
			} else if (((weight >= 170) && (weight <= 220)) && (isMale)) {
				System.out.println("You have been placed in the men's middleweight class.");
				return;
			} else if (((weight > 0) && (weight < 170)) && (isMale)) {
				System.out.println("You have been placed in the men's lightweight class.");
				return;
		}
	}

}
