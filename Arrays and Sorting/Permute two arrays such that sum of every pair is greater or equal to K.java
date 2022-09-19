//Permute two arrays such that sum of every pair is greater or equal to K


//Given two arrays of equal size n and an integer k. 
//The task is to permute both arrays such that sum of their corresponding element is greater than or equal to k i.e a[i] + b[i] >= k.
// The task is print “Yes” if any such permutation exists, otherwise print “No”.


public class Solution{
	public boolean isPossible(int [] nums1, int [] nums2){
		Arrays.sort(nums1);
		Arrays.sort(nums2,Collections.reverseOrder());
		for(int i=0;i<nums1.length;i++){
			if(nums1[i]+nums2[i]<k){
				return false;
			}
		}
		return true;
}
}

time complexcity : o(nlogn)
space complexcity : o(1);