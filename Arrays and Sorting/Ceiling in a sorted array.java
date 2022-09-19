//Ceiling in a sorted array

public class Solution{
	public int findCeil(int [] nums, int x){
		int n=nums.length;
		if(x<=nums[0]){
			return 0;
		}
		for(int i=0;i<n;i++){
			if(nums[i]==x){
				return i;
			}
			if(nums[i]<=x && nums[i+1]>=x){
				return i+1;
			}
		}
		return -1;
	}
	
}

time complexcity: o(n)
space complexcity: o(1)

public class Soution{
	public int findCeil(int []nums, int x){
		int low=0; int high=nums.length-1;
		if(nums.length==0){
			return -1;
		}
		while(low<high){
			int mid=(low+high)/2;
			
			if(x== nums[mid]){
				return mid;
			}
			else if(nums[mid]>x){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return low;
}
}