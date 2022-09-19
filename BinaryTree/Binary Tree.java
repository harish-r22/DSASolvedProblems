//Binary Tree


class Node {
	int key;
	Node left,right;
	Node(int key){
		this.key=key;
		left=right=null;
	}
}
public class BinaryTree{
	Node root;
	
	BinaryTree(int key){
		root=new Node (key);
	}
	BinaryTree(){
		root=null;
	}
	
	public void inOrderTraverse(Node root){
		if(root==null){
			return;
		}
		inOrderTraverse(root.left);
		System.out.println(root.key);
		inOrderTraverse(root.right);
	}
	
	public void preOrderTraverse(Node root){
		if(root==null){
			return;
		}
		
		System.out.println(root.key);
		inOrderTraverse(root.left);
		inOrderTraverse(root.right);
	}
	
	public void postOrderTraverse(Node root){
		if(root==null){
			return;
		}
		inOrderTraverse(root.left);
		inOrderTraverse(root.right);
		System.out.println(root.key);
	}
	
	public static void main(String [] args){
		BinaryTree bt = new BinaryTree();
		bt.root= new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left= new Node(4);
	}
	
}

