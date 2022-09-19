//reverse level order traversal

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}

public class BinaryTree{
	
	Node root;
	
	public BinaryTree(){
		root=null;
	}
	
	
	void printLevelOrderTrav(Node root){
		int h=height(node);
			int i;
			for(i=h;i>=1;i--){
				printCurrentlevel(root,i);
			}
	}
	
	public int height(Node node){
		if(node==null)
			return 0;
		
		return 1+Math.max(height(node.left),height(node.right));
		
	}
	
	public void printLevelOrderTrav(Node node, int level){
		if(node==null)
			return;
		if(level==1){
			System.out.println(node.data + "");
		}else if(level >1){
			printLevelOrderTrav(node.left,level-1);
			printLevelOrderTrav(node.right,level-1);
		}
	}
	
	
	public static void main(String [] args){
		BinaryTree bt= new BinaryTree;
		bt.root= new Node(1);
		bt.root.left=new Node(2);
		 bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
		System.out.println("Level order traversal of 
                                 binary tree is ");
       bt.printLevelOrder();
	}
}


time complexcity : o(n2)
space complexcity : o(n)


---------------------------------------------------------------------------

public void printLevelOrderTrav(Node node){
	if(root==null)
		return;
	Queue<Node> queue= new LinkedList<>();
	Stack<Node> stack = new Stack<>();
	queue.add(node);
	Node temp;
	
	while(!queue.isEmpty()){
		 temp=queue.peek();
		queue.poll();
		stack.push(temp);
		
		
		if(temp.left!=null)
			queue.add(temp.left);
		
		if(temp.right!=null)
			queue.add(temp.right);
	}

    while(!stack.isEmpty()){
		temp=stack.peek();
		stack.pop();
		System.out.println(temp.data);
	}

}

time complexcity : o(n)
space complexcity : o(n)


