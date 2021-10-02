package javaassignment;

import java.util.Scanner;

public class ReverseNo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num:");
		int num = sc.nextInt();
		String str = Integer.toString(num);
		char ch[] = str.toCharArray();
		int len = ch.length;
		//System.out.println(ch);
		String rev ="";
		for(int i=len-1;i>-1;i--) {
			rev = rev+ch[i];
			
		}
		System.out.println("Reverse Number is:"+rev);
	}

}


