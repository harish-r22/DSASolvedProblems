//flattening binary tree

//reverse pre order logic right->left->root

public class Solution{
	static Node prev=null;
	public static Node preorder(Node curr){
		if(curr==null){
			return null;
		}
		flattening(curr.right);
		flattening(curr.left);
		node.left=null;
		node.right=prev;
		prev=curr;
		
	}
	
	public static Node flatten(Node root){
		Node dummy=new Node(-1);
		
		prev=dummy;
		
		preorder(root);
		
		prev.left=null;
		prev.right=null;
		Node ret=dummy.right;
		return ret;
		
	}
}

time complexcity : o(n)
space complexcity : o(n)