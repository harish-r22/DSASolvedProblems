//Count BST nodes that lie in a given range

public class Solution{
	
	public int findNodeBwGivenRange(Node root, int low, int high){
		 if(root==null)
			return 0;
		
		if(root.data >= low  && root.data <= high){
		   return 1 + getCount(root.left,low,high) + getCount(root.right,low,high); 
		}else if(root.data < low){
			return getCount(root.right,low,high);
		}else{
			return getCount(root.left,low,high);
		}
		
	}
}

time complexcity : o(n)
space complexcity : o(n)