package javaassignment;

import java.util.Scanner;

public class StringUppercase {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String to convert UpperCase:");
			String str = sc.nextLine(); 
			sc.close();
			String str1 = UpperCase(str);
			System.out.println(str1);

		}
		public static String UpperCase(String a) {
			return a.toUpperCase();
		}

	

	}


