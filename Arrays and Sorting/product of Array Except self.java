//product of Array Except self


public class solution{
	public int findProduct(int [] nums){
		int n=nums.length;
        int[] nums2= new int[n];
		for(int i=0;i<n;i++){
			int multiply=1;
			for(int j=0;j<n;j++){
				if(i==j){
					continue;
				}
				multiply=multiply*nums[j];
			}
            nums2[i]=multiply;
		}
		return nums2;
	}
}

time complexity o(n2)
space complexity o(n)

public class solution{
	public int findProduct(int [] nums){
		int n=nums.length;
		int multiply=0;
		int count=0;
		for(int i=0;i<n;i++){
			if(nums[i]==0){
				count++;
			}
			multiply *=nums[i];
		}
		for(int i=0;i<n;i++){
			if(count==0){
				nums[i]=multiply/nums[i];
			}else if(count>=1){
				nums[i]=(count==1 ? (nums[i]==0 ? multiply :0 ):0);
			}
			
		}
		return multiply;
	}
}


time complexity o(n) 

without using devision operator

public class Solution{
	public int findProduct(int [] nums){
		int n=nums.length;
		int left[] = new int [n];
		int right[]= new int [n];
		for(int i=0;i<n;i++){
            if(i==0){
                left[i]=nums[i];
            }
            else{
			left[i]= left[i-1] * nums[i];
            }
		}
        
		for(int j=n-1;j>=0;j--){
			if(j==n-1){
                right[j]=nums[j];
            }
            else{
			right[j]= right[j+1] * nums[j];
            }
		}
		    for(int i=1;i<=n-2;i++){
                nums[i]=left[i-1] * right[i+1];
             }
            nums[0]=right[1];
            nums[n-1]=left[n-2];
			return nums;
	}
}

time complexity o(1)
space complexity o(n)

optimization

public class Solution{
	public int findProduct(int [] nums){
	int [] output = new int[n];
	int product=1;
	for(int i=0;i<n;i++){
		product*=nums[i];
		output[i]=product;
	}
	product=1;
	for(int i=n-1;i>=0;i++){
		output[i]=output[i-1]*product;
		product*=nums[i];
	}
	output[0]=product;
	return output;
 } 
}
time complexity o(1)
space complexity o(n)





