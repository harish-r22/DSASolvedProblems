//Validate Binary Search Tree

public class Solution{
	public boolean validatBST(Node root){
		return isValid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	public boolean isValid(Node root,long minvalue, long maxvalue){
		if(root==null)
			return true;
		if(root.val >= maxvalue || root.val <=minvalue ){
			return false;
		}
		
		return (isValid(root.left,minvalue,root.val) && isValid(root.right,root.val,maxvalue));
	}
}

time complexcity: o(n)
space complexcity : o(h)