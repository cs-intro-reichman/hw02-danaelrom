/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		double sumall = 0;
		int count2Children = 0;
		int count3Children = 0;
		int count4AndMore = 0;
		double avg;

		for(int i = 0; i < T; i++)
		{
			boolean girl = false;
			boolean boy = false;
			double sum = 0;
			while (!(boy && girl)){
			double x = Math.random();
			if(x < 0.5){
				girl = true;
			} else{
				boy = true;
			  }
			sum = sum + 1;
			}
			if(sum == 2){
				count2Children++;
			} else if(sum ==3) {
              	count3Children++;
			} else if(sum >= 4){
				count4AndMore++;
			}
			sumall = sumall + sum;
			sum = 0;

		}
		String common = "2";
		if(count3Children > count2Children){
			common = "3";
			if(count4AndMore > count3Children){
				common = "4 and more";
			}
		} else if(count4AndMore > count2Children){
			common = "4 and more";
		} 
		avg = sumall/T;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + count2Children);
		System.out.println("Number of families with 3 children:" + count3Children);
		System.out.println("Number of families with 4 or more children: " + count4AndMore);
		System.out.println("The most common number of children is " + common);

	}
}
