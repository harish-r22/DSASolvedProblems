//Full Binary Tree

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}

class BinaryTree{
	Node root;
	boolean isFullBinaryTree(Node node){
		if(node==null)
			return true;
		
		if(node.left ==null && node.right==null)
			return true;
		
		if(node.right!=null && node.left!=null)
			return (isFullBinaryTree(node.left) && isFullBinaryTree(node.right));
		
		return false;
	}
}