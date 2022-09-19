//Write a program to reverse an array or string

class Solution {
	static void reverse(int [] nums, int n){
		int start=0;
		int end =n-1;
		int temp;
		while(start< end){
			 temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		
	}
	
	start void printArrayEle(int [] nums , int n){
		for(int i=0;i<n ;i++){
			System.out.println(nums[i]);
		}
		System.out.println();
	}
	
	public static void main(String [] args){
		int [] nums={1,22,32,23,23};
		int n=nums.length;
		reverse(nums, n);
		printArrayEle(nums,n)
	}
		
}

//

