//flattening a binary search tree

public class Solution{
	static Node prev=null;
	
	public static void inorder(Node curr){
		if(curr==null){
			return;
		}
		inorder(curr.left);
		prev.left=null;
		prev.right=curr;
		prev=curr;
		inorder(curr.right);
	}
	
	public static Node flatten(Node root){
		Node dummy=new Node(-1);
		
		prev=dummy;
		
		inorder(root);
		
		prev.left=null;
		prev.right=null;
		Node ret=dummy.right;
		return ret;
		
	}
}

time complexcity : o(n)

space complexcity o(h)