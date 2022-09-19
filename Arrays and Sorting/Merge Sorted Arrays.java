//Merge Sorted Arrays

public class Solution{
	public void merge(int [] num1, int [] num2){
		int n=num1.length;
		int m=num2.length;
		
		int [] num3= new int[m+n];
		int j=0;
		for(int i=0;i<n;i++){
			num3[j++]=num1[i];
		}
		for(int i=0;i<m;i++){
			num3[j++]=num2[i];
		}
		Arrays.sort(nums3);
		j=0;
		for(int i=0;i<n;i++){
			num1[i]=num3[j++];
		}
		for(int i=0;i<m;i++){
			num2[i]=num3[j++];
		}
		
	}
}

time complexcity : o(nlogn)+o(n)+o(n)
space complexcity : o(n)

public class Solution{
	public void merge(int [] num1,int [] num2){
		 int m = num1.length;
        int n = num2.length;
		for(int i=0;i<m;i++){
			if(num1[i]>num2[0]){
				int temp=num1[i];
				num1[i]=num2[0];
				num2[0]=temp;
				
				int first=num2[0];
				int k;
				for(k=1;k<n && num2[k]<first ;k++){
					num2[k-1]=num2[k];
				}
				y[k-1]=first;
			}
		}
	}
}