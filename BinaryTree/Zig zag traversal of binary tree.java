//Zig zag traversal of binary tree

public class Solution{
	public List<List<Integer>> zigzagTraverse(Node root){
		if(root==null)
			return null;
		Queue<Node> queue= new LinkedList<>();
		List<List<Integer>> result= new ArrayList<>();
		queue.add(root);
		boolean rightToleft=true;
		while(!queue.isEmpty()){
			int size = queue.size();
			List<Integer> ds= new ArrayList<>();
	      for(int i=0;i<size;i++){		
			Node temp= queue.peek();
			queue.poll();
			int index= (rightToleft)? i : size -1 -i;
			ds[index]=temp.data;
			if(temp.left!=null){
				queue.add(temp.left);
			}
			
			if(temp.right!=null){
				queue.add(temp.right);
			}
		  }
		  rightToleft=!rightToleft;
		  result.add(new ArrayList<>(ds));
		}
		return result;
	}
}


time complexcity : o(n)

space complexcity : o(n)