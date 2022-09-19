// GIven sum pair

public class Solution{
	public boolean pairInSortedRotated(int [] nums, int key){
		int n=nums.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[j]+arr[j]==key){
					return true;
				}
			}
		}
		return false;
		
	}
}

time complexcity: o(n2)
space complexcity:o(1)


public class Solution{
	public boolean pairInSortedRotated(int [] nums,int key){
		int n=nums.length;
		for(int i=0;i<n;i++){
			if(nums[i]>nums[i+i])
				break;
			
		}
		int left=(i+1)%n;
		int right=i;
		while(left!=right){
			if(nums[left]+nums[right]==key){
				return true;
			}
			
			if(nums[left]+nums[right]<key){
				left=(i+1)%n;
			}else{
				right=(n+r-1)%n;
			}
		}
		return false;
	}
}

time complexcity: o(n)
space complexcity: o(1)