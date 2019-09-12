import java.util.*;
public class somethings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] myNums = new int[3];	
		for (int i = 0; i < myNums.length; i++) {
			System.out.println("Input Number: ");
			myNums[i] = s.nextInt();
		}
		for (int i = 0; i <myNums.length; i++) {
			System.out.println(myNums[i]);
		}
	}

}
