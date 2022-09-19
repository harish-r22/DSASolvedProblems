//Inverting Binary TreeWalker

public class Solution{
	
	public void swap(TreeNode root){
		if(root==null)
			return;
		swap(root.left);
		swap(root.right);
		
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
	public TreeNode invertTree(TreeNode root){
		swap(root);
		return root;
	}
}	

time complexcity ; o(n)
space complexcity : o(n)