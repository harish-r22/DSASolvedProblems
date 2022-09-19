//4 sum
//Find four elements that sum to a given value

public class Solution{
	public List<List<Integer>> findFourElements(int []  nums, int target){
		Arrays.sort(nums);
		int n=nums.length;
		List<List<Integer>> list= new ArrayList<>();
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int sum1=target-(nums[i]+nums[j]);
				int start=j+1;
				int end=n-1;
				while(start<end){
					if(nums[start]+nums[end]==sum1){
						list.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
						while(start<end && nums[start]==nums[start+1]){
							start++;
						}
						while(start<end && nums[end]==nums[end-1]){
							end--;
						}
						
					}else if(nums[start]+nums[end]<sum1){
						start++;
						
					}else{
						end--;
					}
				}
				while(j+1<n-1 && nums[j]==nums[j+1]){
					j++;
				}
			}
			while(i+1<n-1 && nums[i]==nums[i+1]){
					i++;
				}
		}
	}
}

time complexcity : o(n2 logn)
space complexcity : o(n)