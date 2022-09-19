//Count triplets with sum smaller than a given value

public class Solution{
	public int countTriplet(int [] nums){
		int n=nums.length;
		int ans=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;i++){
				for(int k=j+1;k<n;k++){
					if(nums[i]+nums[j]+nums[k]<sum){
						ans++;
					}
				}
			}
		}
		return ans;
	}
}

time complexity :  o(n3)
space complexity : o(1)

public class Solution{
	public int countTriplet(int [] nums){
		 Arrays.sort(arr);
		 int ans=0;
		 int n=nums.length;
		 for(int i=0;i<n;i++){
			 int j=i+1,k=n-1;
			 while(j<k){
				 if(arr[i] + arr[j] + arr[k] >= sum){
					 k--;
				 }else{
					 ans+=(k-j);
					 j++;
				 }
			 }
		 }
		 return ans;
	}
}

time complexity :  o(n2)
space complexity : o(1)