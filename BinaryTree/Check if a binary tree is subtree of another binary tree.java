//Check if a binary tree is subtree of another binary tree

public class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
}


public class Solution{
	
	Node root1,root2;
	
	boolean isIdentical(Node root1,Node root2){
		
		if(root1==null && root2 ==null)
			return true;
		
		if(root1==null || root2==null)
			return false;
		
		return (root1.data==root2.data && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right));
	}
	
	boolean isSubtree(Node T, Node S){
		if(S==null)
			return true;
		
		if(T==null)
			return false;
		
		if(isIdentical(T,S))
			return true;
		
		return isSubtree(T.left,S) || isIdentical(T.right,S);
		
	}
	
}



Time Complexity: Time worst-case complexity of above solution is O(mn) where m and n are number of nodes in given two trees. 

Auxiliary space: O(n)