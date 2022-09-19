//convert binary tree to binary search tree

public class Solution{
	
	public static int index=0;
	
	static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
	
	public static int countNodes(Node root){
		if(root==null)
			return 0;
		return  countNodes(root.left) + countNodes(root.right) +1;
	}
	
	public static void storeInArr(Node root, int [] arr){
		if(root==null)
			return;
		storeInArr(root.left,arr);
		arr[index]=root.data;
		index++;
		storeInArr(root.right,arr);
		
	}
	
	public static void arrayToBST(Node root, int [] arr){
		if(root==null)
			return;
		
		arrayToBST(root.left,arr);
		
		root.data=arr[index];
		index++;
		
		arrayToBST(root.right,arr);
	}
	
	public static void binaryTreeBST(Node root){
		if(root==null)
			return;
        int n=countNodes(root);		
		
		int [] arr= new int[n];
		
		storeInArr(root, arr);
		
		Arrays.sort(arr);
		index = 0;
		arrayToBST(Node root, arr);
	}
}