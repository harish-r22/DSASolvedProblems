//find the minimum distance between two nodes

public class Solution{
	
	public Node lcaofTwoNodes(Node root,int p, int q){
		if(root==null || p==root.data || q==root.data )
			return root;
		
		Node left=lcaofTwoNodes(root.left,p,q);
		Node right=lcaofTwoNodes(root.right,p,q);
		if(left==null)
			 return right;
		else if(right==null)
             return left;
        else 
         return root;			
	}
	
	
    public int findLevel(Node root,int value,int level){
		if(root==null)
			return -1;
		if(root.data==value){
			return level;
		}
		
		int left=findLevel(root.left,value,level+1);
		if(left==-1)
			return findLevel(root.right,value,level+1);
		
		return left;
	}
	
	
    public int findMinDistance(Node root, int p, int q){
		Node lca=lcaofTwoNodes(root,p,q);
        
        int d1=findLevel(lca,p,0);
        int d2=findLevel(lca,q,0);
        return d1+d2; 		
    } 	
}