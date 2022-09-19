// Next Permutation

brute force 
1) generate all the permutation and find the next greater element in permutation list

public List<List<Integer>> generatePermutation(int [] nums){
	List<List<Integer> result = new ArrayList<>();
	List<Integer> ds = new ArrayList<>();
	boolean [] freq= new boolean[nums.length];
	generatePermutation(nums,ds,result,freq);
	return result;
}
public void generatePermutation(int [] nums,List<Integer> ds, List<List<Integer>> result,boolean[] freq ){
	if(ds.size()==nums.length){
		result.add(new ArrayList<>(ds));
		return;
	}
	for(int i=0;i<nums.length;i++){
		if(!freq[i]){
			ds.add(nums[i]);
			freq[i]=true;
			generatePermutation(nums,ds,result,freq);
			ds.remove(ds.size()-1);
			freq[i]=false;
		}
	}	
}

time complexity(n*n!)

//      Next permutation

optimised

o(nlogn)

public void nextPermutation(int [] nums){
	int i=0;
	int n=nums.length;
	for(int i=n-1;i>=0;i++){
		if(nums[i] > nums[i-1]){
			break;
		}
	}
	if(i==0){
		Arrays.sort(nums,i,n)
		Arrays.stream(nums).forEach(e-> System.out.println(e));
	}else{
		int x=nums[i-1] , min=i;
		for(int j=i+1;j<n;j++){
			if(nums[j] > x && nums[j]< nums[min]){
				min=j;
			}
		}
		swap(nums,i,min);
		Arrays.sort(nums,i,n);
		for(int y:nums){
               System.out.println(y);
            }
	}
}


optimised


public void nextPermutation(int [] nums){
	int i=nums.length-2;
	while(i>=0 && nums[i]>=nums[i+1]){
		i--;
	}
	if(i>=0){
		int j=nums.length-1;
		while( nums[i] >= nums[j]){
			j--;
		}
		swap(nums,i,j);
	}
	reverse(nums,i+1,nums.length-1);
}

