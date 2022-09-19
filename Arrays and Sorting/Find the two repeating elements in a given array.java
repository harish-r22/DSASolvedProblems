//Find the two repeating elements in a given array



//Find the two repeating elements in a given array

//You are given an array of n+2 elements. All elements of the array are in range 1 to n. 
//And all elements occur once except two numbers which occur twice. Find the two repeating numbers. 

public class Solution{
	public void findRepeat(int [] nums){
		int n=nums.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(nums[i]==nums[j]){
					System.out.println("repeating:"nums[i]);
				}
			}
		}
   }
}


time complexcity :  o(n2)
space complexcity : o(1)

public class Solution{
	public void findRepeat(int [] nums){
		int count[]= new int[nums.length];
		for(int i=0;i<n;i++){
			if(count[nums[i]] ==1 ){
				 System.out.print(nums[i] + " ");
			}else {
				count[nums[i]]++;
			}
		}
	}
}

time complexcity :  o(n)
space complexcity : o(n)



public class Solution{
	public void findRepeat(int [] nums){
		int sum=0;
		int product=1;
		int x,y;
		int diff=0;
		int n=nums.length-2,i;
		for( i=0;i<nums.length;i++){
			sum+=nums[i];
			product*=nums[i];
		}
		
		sum=sum-n(n+1)/2;
		product=product/fact(n);
		
		diff= (int )Math.sqrt(s*s -4p)
		
		x= (diff + s)/2;
		y=(s - diff)/2;
		
		 System.out.println("The two repeating elements are :");
        System.out.print(x + " " + y);
	}
}

time complexcity :  o(n)
space complexcity : o(1)

public class Solution{
	public void findRepeat(int[] nums){
		int n=nums.length;
		for(int i=0;i<n;i++){
			int absVal=Math.abs(nums[i]);
			if(nums[absVal]>0)
			nums[absVal]=-nums[absVal];
		else
			System.out.println("repeating elements:" absVal);
		}
	}
}
time complexcity :  o(n)
space complexcity : o(1)

//
-----------------

public static void twoRepeated(int arr[], int N)
    {
        int m = N - 1;
        for (int i = 0; i < N; i++) {
            arr[arr[i] % m - 1] += m;
  
            if ((arr[arr[i] % m - 1] / m) == 2)
                System.out.printf(arr[i] % m + " ");
        }
    }
	
	
  time complexcity :  o(n)
space complexcity : o(1)


