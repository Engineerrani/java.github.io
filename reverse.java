package javaprg.java;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int t=n;
		while(t>0)
		{
			c=c+1;
			t=t/10;
		}
		//System.out.println(c);
		int sum=0;
		if(c>=3)
		{
			while(n>0)
			{
				sum=n%10+(sum*10);
				n=n/10;
			}
			System.out.println(sum);
		}
		else System.out.println("Is less than 3");
		sc.close();
			
		}
		

	}


