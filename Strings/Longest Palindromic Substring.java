//Longest Palindromic Substring


public class longestPalindromeSubstring(String str){
	int n=str.length();
	int maxlength=1;
	int start=0;
	
	for(int i=0;i<n;i++){
		for(int j=i;j<n;j++){
			int flag=1;
			for(int k=0;k<(j-i+1)/2;k++){
				if(str.charAt(i+k)!=str.charAt(j-k))
					flag=0;
				
				if(flag!=0 && (j-i+1)>maxlength){
					start=i;
					maxlength=j-i+1;
				}

			}
		}
	}
	System.out.print("Longest palindrome subString is: ");
    printSubStr(str, start, start + maxLength - 1);
	return maxlength;
	
}

time complexcity : o(n^3)
space complexcity : o(1)

-------------------------------------------------------

public class Solution{
public int longestPalindromeSubstring(String str){
	int n=str.length;
	int maxLength=1;
	int start=0;
	
	boolean [][] table= new boolean[n][n];
	
	for(int i=0;i<table.length;i++)
		table[i][i]=true;
	
	for(int i=0;i<n;i++){
		if(str.charAt(i)==str.charAt(i+1)){
			table[i][i+1]=true;
			maxLength=2;
			start=i;
		}
	}
	
	
	for(int k=3;k<=n;k++){
		
		for(int i=0;i<n-k+1;i++){
			int j=i+k-1;
			
			if(table[i+1][j-1] && str.charAt(i)==str[]charAt(j)){
				table[i][j]=true;
				
				if(k<maxLength){
					start=i;
					maxLength=k;
				}
			}
			
		}
	}
	return maxLength;
  }
}