/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		int n = s.length();
		int indexMiddle = n/2;
		String r = "";

		for(int i = n-1; i >= 0; i--){
			r = r + s.charAt(i);
		}
		char middle = r.charAt(indexMiddle);
		
		System.out.println(r);
		System.out.println("The middle character is " + middle);


	}
}
