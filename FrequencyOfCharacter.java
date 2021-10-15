package javaAssignment;

import java.util.HashMap;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m="aaabbbcccddeeeffffksacd";
		HashMap<Character,Integer> hmap=new HashMap<>();
		
		
		
		for(int i=0;i<m.length();i++) {
			char ch=m.charAt(i);
			if(ch !=' ') {
				if(hmap.containsKey(ch)==true) {
					int value=hmap.get(ch);
					value=value+1;;
					hmap.put(ch,value);
					
				}
				else {
					hmap.put(ch, 1);
				}
				
			}
			
		}
		for(Character k:hmap.keySet()) {
			System.out.println(k+" frequency: "+hmap.get(k));
		}
		


	}

}
