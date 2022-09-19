//Max depth of binary tree

public class Solution{
	public int findDepth(Node node){
		if(node==null)
			return 0;
		
		return 1+Math.max(findDepth(node.left),findDepth(node.right));
	}
}