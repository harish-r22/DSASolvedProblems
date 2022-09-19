//longest common prefix

public class Solution{
	public String commomPrefix(String [] str, int n){
		String prefix=str[0];
		for(int i=1;i<str.lengh;i++){
		     prefix=  findPrefix(prefix,str[i]);
		}
		return prefix;
	}
	
	public String findPrefix(String prefix, String s){
		int n=prefix.length();
		String result="";
		int m=s.length();
		for(int i=0,j=0; i<n &&j<n;i++,j++){
			if(prefix.charAt(i) != s.charAt(i)){
				break;
			}
			result +=s.charAt(i);
	    }
	}
}

time complexcity : o(n+n)
space complexcity : o(1)

---------------------------------------------------

public class Solution{
	public String commomPrefix(String[] str, int n){
		
		 int minlen = findMinLength(arr, n);
		 String result = ""; // Our resultant string
        char current;
		for(int i=0;i<minlen;i++){
			current=arr[0].charAt(i);
			for(int j=1;j<n;j++){
				if (arr[j].charAt(i) != current)
                {
                    return result;
                }
			}
			result+=current;
		}
		return result;
	}
}

-------------------------------------------------------


static String commonPrefixUtil(String str1, String str2) {
        String result = "";
        int n1 = str1.length(), n2 = str2.length();
 
        for (int i = 0, j = 0; i <= n1 - 1 &&
                j <= n2 - 1; i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            result += str1.charAt(i);
        }
        return (result);
    }
 
// A Divide and Conquer based function to find the
// longest common prefix. This is similar to the
// merge sort technique
    static String commonPrefix(String arr[], int low, int high) {
        if (low == high) {
            return (arr[low]);
        }
 
        if (high > low) {
            // Same as (low + high)/2, but avoids overflow for
            // large low and high
            int mid = low + (high - low) / 2;
 
            String str1 = commonPrefix(arr, low, mid);
            String str2 = commonPrefix(arr, mid + 1, high);
 
            return (commonPrefixUtil(str1, str2));
        }
        return null;
    }
	
	----------------------------------------------
	time complexcity : o(nm)
static int findMinLength(String arr[], int n)
    {
        int min = arr[0].length();
 
        for (int i = 1; i < n; i++)
        {
            if (arr[i].length() < min)
            {
                min = arr[i].length();
            }
        }
 
        return (min);
    }
}