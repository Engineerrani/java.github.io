package javaAssignment;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		int b =nums.length-1;
        while(b>-1){
            if(nums[b]==0){
                for(int i=b; i<nums.length-1;i++){
                    nums[i]=nums[i+1];
                }
                nums[nums.length-1]=0;
            }
            b--;
        }
        for(int x:nums) {
        	System.out.println(x);
        }
	}


	}


