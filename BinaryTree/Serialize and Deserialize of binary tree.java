//Serialize and Deserialize of binary tree

public class Solution{
	public String Serialize(Node root){
		if(root==null)
			return "";
		Queue<Node> queue= new LinkedList<>();
		StringBuilder str= new StringBuilder();
		queue.add(root);
		while(!queue.isEmpty()){
			Node temp= queue.poll();
			if(temp==null){
				str.append("n ");
				continue;
			}
			str.append(temp.val + " ");
			queue.add(node.left);
			queue.add(node.right);
		}
		return str;
	}
	
	public Node Deserialize(String data){
		if(data==""){
			return null;
		}
		Queue<Node> queue= new LinkedList<>()
		String [] values=data.split(" ");
		Node root= new Node(Integer.parseInt(values[0]));
		queue.add(root);
			for(int i=1;i<values.length;i++){
				Node parent=queue.poll();
				if(!values[i].equals("n")){
					Node left= new Node(Integer.parseInt(values[i]));
					parent.left=left;
					queue.add(left);
				}
				if(!values[++i].equals("n")){
					Node right= new Node(Integer.parseInt(values[i]));
					parent.right=right;
					queue.add(right);
				}
			}
		return root;
	}
}


time complexcity : o(n)
space complexcity : o(n)