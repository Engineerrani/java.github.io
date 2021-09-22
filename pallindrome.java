package javaprg.java;

import java.util.Scanner;

public class pallindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word: ");
		String str=scan.nextLine();
		 String str2="";
		 for(int i=str.length()-1;i>=0;i--) {
			 str2=str2+str.charAt(i);
			 System.out.println(str2);
		 }
		 if(str.equals(str2)) {
			 System.out.println("pallindrome");
			 
		 }
		 else {
			 System.out.println("Not pallindrome");
		 }
		scan.close();
	}
	

}
