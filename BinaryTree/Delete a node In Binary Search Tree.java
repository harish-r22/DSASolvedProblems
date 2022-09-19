//Delete a node In Binary Search Tree

public class Solution{
	public Node deleteNode(Node node, int key){
		if(root==null)
			return null;
		if(root.val==key)
			return helper(root);
		
		Node dummyNode=root;
		
		while(root!=null){
			if(root.val>key){
				if(root.left!=null && root.left.val==key){
					root.left=helper(root.left);
					break;
				}else{
					root=root.left;
				}
			}else{
					if(root.right!=null && root.right==key){
						root.right=helper(root.right);
						break;
					}else{
						root=root.right;
					}
				}
		}
		
		return dummyNode;
	}
	
	
	public Node helper(Node root){
		if(root.left==null)
			return root.right;
		
		if(root.right==null)
			return root.left;
		
		Node rightChild=root.right;
		Node lastRight=findLastRight(root.left);
		lastRight.right=rightChild;
		return root.left;
	}
	
	pubic Node findLastRight(Node root){
		if(root.right==null)
            return root;
		return findLastRight(root.right);
	}
}

time complexcity : o(n)
space complexcity : o(h)