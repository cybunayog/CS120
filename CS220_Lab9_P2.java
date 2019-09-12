import java.util.Scanner;
public class CS220_Lab9_P2 {

	public static void main(String[] args) {
		Scanner s  = new Scanner (System.in);
		System.out.println("Please enter a shape(e.g. Square, Parallelogram, Triangle): ");
		String shape = s.next();
		System.out.println("Please enter the base value:");
		double base = s.nextDouble();
		System.out.println("Please enter the height value:");
		double height = s.nextDouble();
			
		printArea(shape, base, height);
	
	}
	
	public static void printArea(String shape, double base, double height) {
		double areaPar;
		double areaTri;
		double areaSqu;
		
		if(shape.equalsIgnoreCase("parallelogram")) {
			areaPar = base * height;
			System.out.println("The parallelogram with base of " + base + " and height of " + height + " has an area of " + areaPar);
		} else if (shape.equalsIgnoreCase("triangle")) {
			areaTri = base * height * 1/2;
			System.out.println("The triangle with base of " + base + " and height of " + height + " has an area of " + areaTri);
		} else if (shape.equalsIgnoreCase("square")) {
			areaSqu = base * height;
			System.out.println("The square with base of " + base + " and height of " + height + " has an area of " + areaSqu);
		}
		
	}

}
