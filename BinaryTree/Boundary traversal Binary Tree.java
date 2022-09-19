//Boundary traversal

class Solution
{
    
    public boolean isLeaf(Node node){
        if(node.left==null && node.right==null)
           return true;
        
        return false;       
    }
	public void addleftBoundary(Node node,ArrayList<Integer> ans){
	  Node curr=node.left;
	  while(curr!=null){
	     if(isLeaf(curr)==false)
	         ans.add(curr.data);
	     if(curr.left!=null)
	       curr=curr.left;
	     else
	      curr=curr.right;
	  }
      
    }
    
    public void addleafNodes(Node node,ArrayList<Integer> ans){
      if(isLeaf(node)){
          ans.add(node.data);
          return;
      }
      if(node.left!=null)
      addleafNodes(node.left,ans);
      if(node.right!=null)
      addleafNodes(node.right,ans);
    }
    
    public void addrightBoundary(Node node,ArrayList<Integer> ans){
      Node curr=node.right;
      ArrayList<Integer> temp= new ArrayList<>();
      while(curr!=null){
          if(isLeaf(curr)==false)
          temp.add(curr.data);
          
          if(curr.right!=null)
            curr=curr.right;
          else
           curr=curr.left;
      }
      int i;
      for(i=temp.size()-1; i>=0 ;i--){
          ans.add(temp.get(i));
      }
    }
    
    
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> result = new ArrayList<>();
	    if(isLeaf(node)==false)
	      result.add(node.data);
	    addleftBoundary(node,result);
	    addleafNodes(node,result);
	    addrightBoundary(node,result);
	    return result;
	}  
}


time complexcity : o(n)+(n)+(n)
space complexcity : o(h)