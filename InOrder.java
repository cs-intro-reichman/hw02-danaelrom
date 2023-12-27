/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int num1 = (int)(Math.random() * 10);
		int num2;

		do{
		    System.out.println(num1);
		    num2 = num1;
		    num1 = (int)(Math.random() * 10);
			} while (num1 >= num2);
			

	
	}
}

