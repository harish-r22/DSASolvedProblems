//Balanced Binary tree

class Node {
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}

class BinaryTree{
	Node root;
	boolean IsBalanced(Node node){
		int lh;
		int rh;
		if(node ==null)
			return true;
		lh =height(node.left);
		rh=height(node.right);
		
		if(Math.abs(lh-rh) <=1 && isBalanced(node.left) && isBalanced(node.right))
			return true;
		
		return false;
	}
	
	public int height(Node node){
		if(node==null)
			return 0;
		
		return 1+Math.max(height(node.left),height(node.right));
	}
}