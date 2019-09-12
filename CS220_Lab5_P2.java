import java.util.Scanner;
public class CS220_Lab5_P2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String webAdd;

		System.out.println("Please enter a website address:");

		webAdd = sc.next();
		
		int web = webAdd.indexOf(".") + 1; //locates period
		webAdd = webAdd.substring(web); //deletes before, but will delete what's after if the +1 is added
		
		web = webAdd.indexOf("."); 
		webAdd = webAdd.substring(web);
		
		System.out.println(webAdd);
		
		switch(webAdd) {
		case ".gov":
			System.out.println("This address is a government address.");
			break;
		case ".edu":
			System.out.println("This address is a university address.");
			break;
		case ".com":
			System.out.println("This address is an business address.");
			break;
		case ".org":
			System.out.println("This is an organization address.");
			break;
		default:
			System.out.println("The address is from an unknown entity.");
			break;
		}

	}

}
