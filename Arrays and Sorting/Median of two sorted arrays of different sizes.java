//Median of two sorted arrays of different sizes

public class Solution{
	public float findMedian(int [] num1, int [] num2){
		int n=num1.length;
		int m=num2.length;
		int i=0,j=0,k=0;
		int temp[]= new int[m+n];
		while(i< n-1 && j< m-1){
			if(num1[i]<num2[j]){
				temp[k++]=num1[i++];
			}else{
				temp[k++]=num1[i++];
			}
		}
		while(i< n-1){
			temp[k++]=num1[i++];
		}
		while(j< m-1){
			temp[k++]=num1[i++];
		}
		n=temp.length;
		if((m+n)%2==0)
			return (float) ((double) (temp[n / 2] + 
                                      temp[n / 2 - 1]) / 2);
									  
		return temp[n/2];
	}
}


//time complexcity : 0(n1+n2)
sapace complexcity : o(n1+n2)

------------------------------------------------------------------------

public class Solution{
	public double findMedian(int [] num1, int num2, int m , int n){
		if(m>n){
			return findMedian(num2,num1,n,m);
		}
		int low=0; 
		int high=m,medianPos=((m+n)+1)/2;
		while(low<=high){
			int cut1=(low+high)/2;
			int cut2=medianPos-cut1;
			
			int l1=(cut1==0 )? Integer.MIN_VALUE : num1[cut1-1];
			int l2=(cut2==0) ? Integer.MIN_VALUE : num2[cut2-1];
			int r1=(cut1==m) ? Integer.MAX_VALUE : num1[cut1];
			int r2=(cut2==n) ? Integer.MAX_VALUE : num2[cut2];
			
			if(l1 < =r2 && l2<=r1){
				if((m+n)%2==0){
					return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
				}
				return (Math.max(l1,l2));
				
			}else if(l1>r2){
				high=cut1-1;
			}else{
				low=cut1+1;
			}
		}
		return 0.0;
	}
}

time complexcity : 0(logn)
sapace complexcity : o(n)