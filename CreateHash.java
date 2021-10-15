package javaAssignment;

import java.util.HashMap;

public class CreateHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1, "Rani");
		map.put(2, "shailesh");
		map.put(3, "kavya");
		map.put(4, "krishna");
		
		map.put(5, "Dhiraj");
		
		for(Integer key:map.keySet()) {
			System.out.println(key+"=>"+map.get(key));
		}
	}
}
