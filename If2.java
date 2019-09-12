import java.util.Scanner;
public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Input your age: ");
		int age = sc.nextInt();
		//int age;
		//age = sc.nextInt();

		if (age >= 21) {
			System.out.println("You can drink.");
		} else if (age >= 18) {
			System.out.println("You can vote.");
		} else if (age >= 16) {
			System.out.println("You can drive.");
		} else {
			System.out.println("You cannot do anything.");
		}
	}

}
