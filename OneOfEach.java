
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean girl = false;
		boolean boy = false;
		int sum = 0;
		while (!(boy && girl)){
			double x = Math.random();
			if(x < 0.5){
				girl = true;
				System.out.print("g ");
			} else{
				boy = true;
			    System.out.print("b ");
			  }
			sum = sum + 1;
		    System.out.print(" ");

		}
	System.out.println("You made it... and you now have " + sum + " children.");

		
	}
}
