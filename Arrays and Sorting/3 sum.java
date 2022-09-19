// 3 sum

public List<List<Integer>> ThreeSum(int [] nums){
	Arrays.sort(nums);
	int n=nums.length;
	List<List<Integer>> result= new ArrayList<>();
	for(int i=0;i<n-2;i++){
		List<Integer> list= new ArrayList<>();
		if(i==0 || (i>0) && nums[i]!=nums[i-1]){
			int val=nums[i];
			int start=i+1;
			int end=n-1;
			while(start<end){
				if(val+nums[start]+nums[end]==0){
					while(start< end && nums[start]==nums[start+1]){
						start++;
					}
					while(start< end && nums[end]==nums[end-1]){
						end --;
					}
					list=Arrays.asList(val,nums[start],nums[end]);
					Collections.sort(list);
					result.add(list);
					start++;
					end--;
				}else if(sum <0) {
					start++;
				}else{
					end--;
				}
			}
			
		}
	}
	return result;
}


time complexity: o(n2)
space complexity: o(n)