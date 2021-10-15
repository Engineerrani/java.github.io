package javaAssignment;

import java.util.HashMap;

public class CreateStudentListWithId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, String> student =new HashMap<>();
		student.put(1,"Rani");
		student.put(2,"Kavya");
		student.put(3,"Arpita");
		student.put(4,"Pranali");
		student.put(5,"Sneha");
		
		for(Integer i : student.keySet()) {
			
			System.out.println("Key-"+ i+" value-"+student.get(i));
			
		}
		
	}



	}


