//Minimum number of swaps required to sort an array


public class Solution{
	public int minSwaps(int nums[]){
		int n=nums.length;
		int ans=0;
		int [] temp= Arrays.copyOfRange(nums,0,n);
		Arrays.sort(temp);
		for(int i=0;i<n;i++){
			if(nums[i]!=temp[i]){
				ans++;
				swap(arr,i,indexOf(nums,temp[i]));
			}
		}
		return ans;
	}
	public void swap(int [] arr,int i, int j){
		int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
	}
}

