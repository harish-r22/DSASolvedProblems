Recursion programs----------- very basic programs using recursion
//1) reverse an array

public int[] reverseArray(int [] nums ){
	int left=0;
	int right=nums.length-1;
	reverseArray(nums,left,right);
	return nums;
}
public void reverseArray(int [] nums,int left,int right){
	if(left>=right){
		return;
	}
	swap(nums,nums[left],nums[right]);
	reverseArray(nums,left+1,right-1);
}
public void swap(int [] nums,int i , int j){
	int temp=i;
	i=j;
	j=temp;
}


//2)generate geneFibo
public void generateFibo(int n){
	if(n<=1){
		return n;
	}
	return generateFibo(n-1)+generateFibo(n-2);
}


// memoization
public void generateFibo (int n  , int [] dp){
	if(n<=1){
		return n;
	}
	if(dp[n]!=-1)
		return dp[n];
	return dp[n]=generateFibo(n-1)+generateFibo(n-2);
}

// tabulation
public int generateFibo (int n  ){
	int prev1=0;
	int prev=0;
	for(int i=2;i<=n;i++){
		int curi=prev1+prev;
	    prev1=prev;
        prev=curri		
	}
	return prev;
}


//3) print all subsequences
public List<List<Integer>> subsequences(int [] nums){
	List<List<Integer>> ans= new ArrayList<>();
	getSubsequences(nums,ans,0,new ArrayList<>());
	return ans;
}
public void getSubsequences(int [] nums,List<Integer> ans,int index,List<Integer> temp){
	if(index==nums.length){
		ans.add(new ArrayList<Integer>(temp));
		return;
	}
	temp.add(nums[index]);
	getSubsequences(nums,ans,index+1,temp);
	temp.remove(temp.size()-1);
	getSubsequences(nums,ans,index+1,temp);
}

//4) print subsequence whose sum is k

public List<List<Integer>> subsequence(int [] nums, int k){
	List<List<Integer>> list= new ArrayList<>();
	getSubsequences(nums,k,list,0,0,new ArrayList<>());
	return list;
}
public void getSubsequences(int [] nums.int k,List<Integer> list,int index,int sum,List<Integer> temp){
	if(index==nums.length){
		if(sum==k){
			list.add(new ArrayList<>(temp));
			return
		}
	}
	temp.add(nums[index]);
	getSubsequences(nums,k,list,index+1,sum+nums[index],temp);
	temp.remove(temp.size()-1);
	sum=sum-nums[index];
	getSubsequences(nums,k,list,index+1,sum,temp);
}


//5) print only one subsequence whose sum is k 

public List<List<Integer>> subsequence(int [] nums, int k){
	List<List<Integer>> list= new ArrayList<>();
	getSubsequences(nums,k,list,0,0,new ArrayList<>());
	return list;
}

public boolean getSubsequences(int [] nums.int k,List<Integer> list,int index,int sum,List<Integer> temp){
	if(index==nums.length){
		if(sum==k){
			list.add(new ArrayList<>(temp));
			return true;
		}else{
			return false;
		}
	}
	temp.add(nums[index]);
	if(getSubsequences(nums,k,list,index+1,sum+nums[index],temp)==true){
		return true;
	}
	temp.remove(temp.size()-1);
	sum=sum-nums[index];
	if(getSubsequences(nums,k,list,index+1,sum,temp)==true){
		return true;
	}
	return false;
}



//6)  count the subsequence with sum =k


public boolean getSubsequences(int [] nums.int k,List<Integer> list,int index,int sum,List<Integer> temp){
	if(index==nums.length){
		if(sum==k){
			list.add(new ArrayList<>(temp));
			return 1;
		}else{
			return 0;
		}
	}
	temp.add(nums[index]);
	int l=getSubsequences(nums,k,list,index+1,sum+nums[index],temp);
	temp.remove(temp.size()-1);
	sum=sum-nums[index];
	int r=getSubsequences(nums,k,list,index+1,sum,temp);
	return l+r;
}