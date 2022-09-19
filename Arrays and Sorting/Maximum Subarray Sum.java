//Maxmum sumarray sum



public class solution{
	public int maxProductSubArray(int nums[]){
		int maxValue=0;
		int n=nums.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
                int sum=0;
				for(int k=i; k<=j;k++){
					sum+=nums[k];
				}
                 maxValue=Math.max(maxValue,sum);
			}
		}
		return maxValue;
	}
}

time complexity o(n3)


// optimised


public class solution{
	public int maxProductSubArray(int nums[]){
		int maxValue=0;
		int n=nums.length;
		for(int i=0;i<n;i++){
			int sum=nums[i];
			for(int j=0;j<n;j++){
				sum+=nums[j];
				maxValue=Math.max(maxValue,sum);
			}
		}
		return m
	}
}

time complexity o(n2)


optimised  ->  Kaden's Algorithm

public class solution{
	public int maxProductSubArray(int nums[]){
		int maxValue=nums[0];
		int currentSum=0;
		int n=nums.length;
		for(int i=0;i<n;i++){
			sum+=nums[i];
			maxValue=Math.max(maxValue,sum);
			if(sum<0){
				sum=0;
			}
		}
		return maxValue
	}
}
