package javaassignment;

public class B {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		B obj = new B();
		//method using static in Class B
		B.show();
		//method not using static in Class B
		obj.add(5,6);
		//Giving input From User
		obj.sum();
	
		}

	private void sum() {
		// TODO Auto-generated method stub
		
	}

	private void add(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private static void show() {
		// TODO Auto-generated method stub
		
	}

}


