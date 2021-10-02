package javaassignment;
import java.util.Scanner;

public class check_string_is_alphanumeric {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the to the check alphanumeric:");
		String a = sc.nextLine();
		boolean x = IsAlphanumeric(a);
		System.out.println(x);
	}
	public static  boolean IsAlphanumeric(String s) {
		if(s.matches("[a-zA-Z0-9]+")) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
