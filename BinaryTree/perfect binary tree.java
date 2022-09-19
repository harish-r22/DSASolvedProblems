//perfect binary tree

public class PerfectBinaryTree{
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
		}
	}
	
	
	static int depth(Node node){
		int d=0;
		while(node!=null){
			d++;
			node=node.left;
		}
		return d;
	}
	
	static boolean isPerfect(Node root){
		int depth=depth(root);
		return isPerfect(root,depth,0);
	}
	
	static boolean isPerfect(Node root, int d, int level){
		if(root==null)
			return true;
		
		if(root.left==null && root.right==null){
			return d==level+1;
		}
		if(root.left==null || root.right==null )
			return false;
		
		return isPerfect(root.left,d,level+1) && isPerfect(root.right,d,level+1);
	}
}