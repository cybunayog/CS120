import java.util.Random;
import java.util.Scanner;
public class var4{

	public static void main(String[] args) {
		Random rd = new Random(); //random number generator
		Scanner sc = new Scanner(System.in);
		
		String a;
		int b;
		double c;
		a = "hello";
		b = 5;
		c = 10.0;
		System.out.println(a + b + c);
		System.out.println(b + c + a);

		int d;
		d = 2000000000;
		int e;
		e = d + d;
		System.out.println(e); //this created a negative number, bc in binary 0 & 1 carries over to make a negative
		
		int f;
		f = rd.nextInt(91) + 10; //generate random number in [10, 100]
		int g = rd.nextInt(90) + 10; //generate random rumber [10, 99] or [10,100]
		//to generate a number in [a, b] a < b
		//write rd.nextInt(b-a+1)+a;
	}

}
