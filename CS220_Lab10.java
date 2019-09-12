
public class CS220_Lab10{
	
	public static char[] strToCharArray(String str) {
		return str.toCharArray();
	}
	
	public static void reversePrint(char [] charArr) {
		char [] rev = new char [charArr.length];
		for (int i = 0; i <= rev.length - 1; i++) {
			rev[i] = charArr[Math.abs((charArr.length - 1) - i)];
			System.out.print(rev[i]);
		}
	
	}

	public static void main(String[] args) {

		reversePrint(strToCharArray("Watashi ga kita."));
	}

}
