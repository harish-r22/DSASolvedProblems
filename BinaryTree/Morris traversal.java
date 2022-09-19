//K’th Largest element in BST using constant extra space

//Morris traversal s that we can do Inorder traversal without using stack or recursion 
//which saves us memory consumed by stack or recursion call stack


//Reverse Morris traversal is just the reverse of Morris traversal which is majorly used 
//to do Reverse Inorder traversal with constant O(1) extra memory consumed as it does not uses any Stack or Recursion.

public class Solution{
	
	public List<Integer> getInorder(Node root){
		ArrayList<Integer> list= new ArrayList<>();
		Node curr=root;
		while(curr!=null){
			if(curr.left==null){
				list.add(curr.val)
				curr=curr.right;
			}else{
				Node prev=curr.left;
				while(prev.right!=null && prev.right!=curr){
					prev=prev.right;
				}
				if(prev.right==null){
					prev.right=curr;
					curr=curr.left;
				}else{
					prev.right=null
					list.add(curr.val);
					curr=curr.right;
				}
			}
			
		}
		
		return list;
	}
}


time complexcity : o(n)
space complexcity : o(1)


-------------------------------------------


public class Solution{
	
	public List<Integer> getPreorder(Node root){
		ArrayList<Integer> list= new ArrayList<>();
		Node curr=root;
		while(curr!=null){
			if(curr.left==null){
				list.add(curr.val)
				curr=curr.right;
			}else{
				Node prev=curr.left;
				while(prev.right!=null && prev.right!=curr){
					prev=prev.right;
				}
				if(prev.right==null){
					prev.right=curr;
					list.add(curr.val);
					curr=curr.left;
				}else{
					prev.right=null
					curr=curr.right;
				}
			}
			
		}
		
		return list;
	}
}



time complexcity : o(n)
space complexcity : o(1)