package javaassignment;

import java.util.Scanner;

public class CircleRadius {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius of circle:");
	int r = sc.nextInt();
	circumference(r);
	radius(r);
	}
	static void circumference(int r) {
		int n = 2;
		double d= 3.14;
		System.out.println("Circumference of circle:"+n*d*r);
	}
	static void radius(int r) {
		double d=3.14;
		int n1=r*r;
		System.out.println("Area of circle:"+d*n1);
	
	

	}

}
