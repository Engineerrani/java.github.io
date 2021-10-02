package javaassignment;

public class Array_XOR {
	public static void main(String[] args) {
		int[] arr = {20,10,30,10,30};
		for(int i=1;i<arr.length;i++) {
			int count=1;
			for(int j=1;j<arr.length;j++) {
				if((arr[i]^arr[j])==1 && i!=j) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(arr[i]+" ");
			}
			
		}
		

	}

}


