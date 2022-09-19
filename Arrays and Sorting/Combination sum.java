//Combination sum

public class Solution{
	public List<List<Integer>> combinationSum(int [] nums, int k){
		<List<Integer>> result= new ArrayList<>();
		findCombination(nums,k,0,result,new ArrayList<>());
		return result;
	}
	
	public void findCombination(int [] nums,int target,int index,List<List<Inetegr>> result,List<Inetger> ds){
		if(index==nums.length){
			if(target==0){
				result.add(new ArrayList<>(ds));
			}
			return;
		}
		
		if(nums[index]<target){
			ds.add(nums[index]);
			findCombination(nums,target-nums[index],index+1,result,ds);
			ds.remove(ds.size()-1);
		}
		findCombination(nums,target,index+1,result,ds);
	}
}
