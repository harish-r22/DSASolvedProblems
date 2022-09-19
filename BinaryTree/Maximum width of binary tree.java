//Maximum width of binary tree



public class Pair{
		   Node node;
		   int num;
		   Pair(Node node,int num){
			   this.node=node;
			   this.num=num;
		   }
	   }
	   
	   
 class Solution{
       public int maxWidthofBinTree(Node root){
		   if(root==null)
			   return 0;
		   int ans =0;
		   Queue<Pair> queue= new LinkedList<>();
		   queue.add(new Pair(root,0));
		   while(!queue.isEmpty()){
			   int size=queue.size();
			   int min=queue.peek().num;
			   int first=0, last=0;
			   for(int i=0;i<size;i++){
				   int cur_in=queue.peek().num-min;
				   Node node= queue.peek().node;
				   queue.poll();
				   if(i==0){
					   first=cur_in;
				   }
				   if(i==size-1){
					   last=cur_in;
				   }
				   if(node.left!=null){
					   queue.add(new Pair(node.left,cur_in*2+1));
				   }
				   if(node.right!=null){
					   queue.add(new Pair(node.right,cur_in*2+2));
				   }
			   }
			   ans=Math.max(ans,(last-first+1));
		   }
		   return ans;
	   }
   
}