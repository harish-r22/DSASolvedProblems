//Contains Duplicate

class solution {
	public boolean checkDuplicate(int nums[]){
		Set<Integer> set= new HashSet<>();
		for(int num : nums){
			if(set.containsKey(num)){
				return true;
			}else{
				set.add(num);
			}
		}
		return false;
	}
}


Check if a given array contains duplicate elements within k distance from each other

class solution {
	public boolean checkDuplicate(int nums[], int k){
		int n=nums.length;
		for(int i=0;i<n;i++){
			int range =k
			int j=i+1;
			while(j < n && range > 0){
				if(nums[i]==nums[j]){
					return true;
				}
				j++;
				range--;
			}
		}
		return false;
	}
}
time complexity o(nk)

class solution {
	public boolean checkDuplicate(int nums[], int k){
		Set<Integer> set = new HashSet<>();
		int n=nums.length;
		for(int i=0;i<n;i++){
			if(set.contains(num)){
				return true;
			}
			set.add(num);
			
			if(i >=k){
				set.remove(i-k);
			}
		}
		return false;
	}
}