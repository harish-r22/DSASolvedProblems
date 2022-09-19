//Left View of Binary Tree

public class Solution{
	
	public List<Integer> leftView(Node root){
		List<Integer> list= new ArrayList<>();
		leftView(list,0,root);
		return list;
	}
	public void leftView(Node root, int level, List<Integer> list){
		if(root==null)
			return;
		
		if(level==list.size()){
			list.add(root.data);
		}
		
		leftView(root.left,level+1,list);
		leftView(root.right,level+1,list);
	}
}



time complexcity : o(n)
space complexcity : o(h)

h is height of binary tree