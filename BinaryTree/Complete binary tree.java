//Complete binary tree

public class CompleteBinaryTree{
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
		}
	}
	
	Node root;
	
	static int countNoNodes(Node root){
		if(root==null)
			return 0;
		else
			return 1+ countNoNodes(root.left) + countNoNodes(root.right);
	}
	
	boolean isCompleteBt(Node root, int index,int count){
		if(root==null)
			return true;
		
		
		if(index>=count){
			return false;
		}
		
		return isCompleteBt(root.left,2*index+1,count) && isCompleteBt(root.right,2*index+2,count);
	}
}