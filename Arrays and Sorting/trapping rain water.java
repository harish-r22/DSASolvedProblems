// trapping rain water
public class Solution{
	public int getTotalAmountWater(int [] nums){
		int n=nums.length;
		int result=0;
		for(int i=0;i<n;i++){
			int left=nums[i];
			for(int j=0;j<i;j++){
				left=Math.max(left,nums[j]);
			}
			int right =nums[i];
			for(int k=i;k<n;k++){
				right=Math.max(right,nums[i]);
			}
			
			result+=Math.min(right,left)-nums[i];
			
		}
		return result;
	}
}

time complexity : o(n2)
space complexity : o(1)



public class Solution{
	public int getTotalAmountWater(int [] nums){
		int n=nums.length;
		int result=0;
		int [] prefix = new int[n];
		int [] suffix= new int[n];
		prefix[0]=nums[0];
		for(int i=1;i<n;i++){
			prefix[i]=Math.max(prefix[i-1],nums[i]);
		}
		suffix[n-1]=nums[n-1];
		for(int i=n-2;i>=0;i--){
			suffix[i]=Math.max(suffix[i+1],nums[i]);
		}
		
		for(int i=0;i<n;i++){
			result+=Math.min(left[i],right[i])-nums[i];
			
		}
		return result;
	}
}

time complexity : o(n+n+n)
space complexity : o(2n)
----------------

public class Solution{
	public int getTotalAmountWater(int [] nums){
		int n=nums.length;
		int left_max=0;
		int right_max=0;
		int low=0,high=n-1;
		while(low<=high){
			if(nums[low]<=nums[high]){
				if(nums[low]>left_max){
					left_max=nums[low];
				}else {
					result+=left_max-nums[low];
				}
				low++;
			}else{
				if(nums[high]>right_max){
					right_max=nums[high];
				}else{
					result+=right_max-nums[high];
				}
				high--;
			}
		}
		
		return result;
	}
}


time complexity: o(n)
space complexity: o(1)

