package Assignment;

import java.util.Scanner;

public class TakingmultipleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=null, b=null;
		/*string arrays hold all the inputs*/
		String input[];
		Scanner s = new Scanner(System.in);
				/*splits the input strings on spaces and stores everyword inside input array*/
				input = s.nextLine().split("");
		/*Since all the input are of string type we need to convert the first input[0] to int type.*/
		System.out.println(Integer.parseInt(input[0]));
		/*Integer .parseInt()does the job of converting.*/
		
				System.out.println(input[1]);
		/*input[1] still is in string format*/
		

	}

}
