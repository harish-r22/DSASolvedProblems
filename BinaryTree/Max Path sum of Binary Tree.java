//Max Path sum of Binary Tree

Public class Solution{
	public int maxPathSum(Node root){
	int [] maxVlaue= new int[1];
	maxValue[0]=Integer.MIN_VALUE;
	maxPathSumDown(root,maxVlaue);
	return maxVlaue[0];
	}
	
	public int maxPathSumDown(Node node , int[] maxValue){
		if(root==null)
			return 0;
		int left=Math.max(0,maxPathSumDown(node.left,maxValue));
		int right=Math.max(0,maxPathSumDown(node.right,maxValue));
		maxValue[0]=Math.max(maxValue[0],left+right+root.data);
		return Math.max(left,right)+node.data;
		
	}
}

time complexcity : o(n)
space complexcity : o(h)