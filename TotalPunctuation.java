package javaAssignment;

import java.util.Scanner;

public class TotalPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		int n=str.length();
		int c=0;
		char []ch=str.toCharArray();
		for(int i=0;n>i;i++)
		{
			if(Character.isAlphabetic(ch[i])||Character.isWhitespace(ch[i]))
			{
				continue;
			}
			else c++; 
		}
		System.out.print(c);
		sc.close();
		
	}



	}


