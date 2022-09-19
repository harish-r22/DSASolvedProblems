//Preorder to BST

public class Solution{
	
	public static int[] constructInorder(int [] preorder){
		int n=preorder.length;
		int[] temp=new int[n];
		temp=Arrays.copy(preorder,n);
		Arrays.sort(temp);
		return temp;
	}
	
	public static Node preOrderToBST(int [] preorder){
		int[] inorder=constructInorder(preorder);
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;inorder.length;i++){
			map.put(inorder[i],i);
		}
		return buildBST(preorder,0,preorder.length,inorder,0,inorder.length,map);
	}	


   public static Node buildBST(int [] preorder , int prestart, int preend, int[] inorder, 
   int instart, int inend, Map<Integer,Integer> map){
	   if(prestart>preend || instart > inend){
		   return null;
	   }
	   
	   Node root= new Node(preorder[prestart]);
	   int inroot= map.get(root);
	   int numsleft=inroot-instart;
	   root.left=buildBST(preorder,prestart+1,prestart+numsleft, inorder, instart,inroot-1,map);
	   root.right=buildBST(preorder,prestart+numsleft+1,preend,inorder,inroot+1,inend,map);
	   
   }	   
}


time complexcity : o(nlogn) + o(n)

space complexcity : o(n)


------------------------------------------
//optimised approach

public class Solution{
	public Node bstFromPreorder(int [] preorder){
		return buildBST(preorder,Integer.MAX_VALUE,new int[] {0}); 
	}
	
	public Node buildBST(int [] preorder,int bound, int [] i){
		if(i[0]==preorder.length || preorder[i[0]]>bound){
			return null;
		}
		Node root= new Node(preorder[A[0]++]);
		root.left=buildBST(preorder,root.value,i);
		root.right=buildBST(preorder,bound,i);
		return root;
	}
}

time complexcity :  o(n)

space complexcity : o(1)
