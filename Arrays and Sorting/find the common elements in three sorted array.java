//find the common elements in three sorted array


//solution 1 works without duplicates elements

public class Solution{
	public void findCommonElementsInArray(int [] num1, int [] num2, int [] num3){
		int i,j,k=0;
		int n1=num1.length, n2=num2.length,n3=num3.length;
		while(i < num1 && j < num2.length && k< num3.length){
			if(num1[i]==num2[j]==num3[k]){
				System.out.print(num1[i]);
				i++;
				j++;
				k++;
			}
			if(num1[i]<num2[j]){
				i++;
			}else if(num2[j]<num3[k]){
				j++;
			}else{
				k++;
			}
		}
	}
}


time complexcity : 0(n1 + n2 + n3)
space complexcity:o(1)


// solution 2 works with duplicate elements

public class Solution{
	public void findCommonElementsInArray(int [] num1, int [] num2, int [] num3){
		int i,j,k=0;
		int n1=num1.length, n2=num2.length,n3=num3.length;
		int prev1,prev2,prev3;
		while(i < num1 && j < num2.length && k< num3.length){
			while(i < n1 && num1[i]==prev1){
				i++;
			}
			while(j < n2 && num2[j]==prev2){
				j++;
			}
			while(k<n3 && num3[k]==prev3){
				k++;
			}
			
			if(num1[i]==num2[j] && num2[j]==num3[k]){
				prev1=num1;
				prev2=num2;
				prev3=num3;
				i++;
				j++;
				k++;
			}
			else if(num1[i]<num2[j]){
				prev1=num1[i];
				i++;
			}else if(num2[j]<num3[k]){
				prev2=num2[j];
				j++;
			}else{
				prev3=num3[k]
				k++;
			}				
				
		}
	}
}	

time complexcity : o(n1 +n2+n3)
space complexcity:o(1)

 
public class Solution{
	public void findCommonElementsInArray(int num1[],int [] num2,int [] num3){
		int i,j,k=0;
		int n1=num1.length, n2=num2.length,n3=num3.length;
		int max=Integer.MIN_VALUE;
		int res1=1;
		for(int i=1;i<n1;i++){
			max=Math.max(max,num1[i]);
			if(num1[i] != num1[res1-1]){
			  num1[res1]=num1[i];
              res1++;			  
			}
		}
		
		int res2=1;
		
		for(int i=1;i<n2;i++){
			max=Math.max(max,num3[i]);
			if(num2[i]!=num2[res2-1]){
				num2[res2]=num2[i];
				res2++;
			}
		}
		int res3=1;
		for(int i=1;i<n3;i++){
			max=Math.max(max,num3[i]);
			if(num3[i]!=num3[res3-1]){
				num3[res3]=num3[i];
				res3++;
			}
		}
		int [] freq= new int[max+1];
		for(int i=0;i<num1;i++){
			freq[num1[i]]++;
		}
		for(int i=0;i<num2;i++){
			freq[num2[i]]++;
		}
		for(int i=0;i<num3;i++){
			freq[num3[i]]++;
		}
		
		for(int i=0;i<=max;i++){
			if(freq[i]==3){
				System.out.println(""+i);
			}
		}
	}
}

time complexcity : o(n1+n2+n3)
space complexcity: o(max of element in array)
// 

solution using hashset

public class Solution{
	public void findCommonElementsInArray(int [] num1,int [] num2, int[] num3){
		int n1=num1.length, n2=num2.length,n3=num3.length;
		Set<Integer> set1=new HashSet<>()
		Set<Integer> set2=new HashSet<>()
		Set<Integer> set3=new HashSet<>()
		for(int i=0;i<n1;i++){
			set1.add(num1[i]);
		}
		for(int i=0;i<n2;i++){
			set2.add(num2[i]);
		}
		for(int i=0;i<n3;i++){
			if(set1.contains(num3[i]) && set2.contains(num3[i])){
				if(set3.contains(num3[i])==false){
					System.out.println( num3[i]);
				}
				set3.add(num3[i]);
			}
		}
	}
	
}
time complexcity : o(n1+n2+n3)
space complexcity: o(n1+n2+n3)

SOlution using binary search

public class Solution{
	public boolean binarySearch(int [] num,int element,int n){
		int low=0,high=n-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(num[mid]==element){
				return true;
			}else if(num[mid] > element){
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return false;
	}
	public void findCommonElementsInArray(int [] num1,int [] num2, int[] num3 ){
		nt n1=num1.length, n2=num2.length,n3=num3.length;
		for(int i=0;i<n1;i++){
			if(j! =0 && num1[i]!=num1[i-1]){
				continue;
			}
			if(binarySearch(num2,num1[i],n2) && binarySearch(num3,num1[i],n3)){
				System.out.print(num3[i] + " ");
			}
		}
	}
}

time complexcity : o(n1log(n2 * n3))
space complexcity: o(1)

