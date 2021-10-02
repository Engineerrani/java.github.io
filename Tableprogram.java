package javaassignment;

import java.util.Scanner;

public class Tableprogram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Which Table do you want");
		int n = sc.nextInt();
		for (int i=1;i<11;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}

	}

}


