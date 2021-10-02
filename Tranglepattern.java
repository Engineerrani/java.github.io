package javaassignment;

import java.util.Scanner;

public class Tranglepattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = sc.nextInt();
		String str = "";
		for (int i=0;i<n;i++) {
			str=str+"*";
			System.out.println(str);
		}

	}

}

