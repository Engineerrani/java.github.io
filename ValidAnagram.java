package javaAssignment;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asdsdefc";
		String t = "bdnjugab";
		boolean flag = false;
        char[] achar = s.toCharArray();
        char[] bchar = t.toCharArray();
        Arrays.sort(achar);
        Arrays.sort(bchar);
        if(achar==bchar){
            flag = true;
        }
        System.out.println(achar);
        System.out.println(bchar);
        System.out.println(flag);
	}


	}


