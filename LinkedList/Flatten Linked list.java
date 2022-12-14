//Flatten Linked list


class GfG
{
    Node flatten(Node root)
    {
	   if(root==null || root.next==null){
	       return root;
	   }
	   root.next=flatten(root.next);
	   root= mergeLinkedList(root,root.next);
	   return root;
    }
	
    
   public Node mergeLinkedList(Node a,Node b ){
        Node temp=new Node(-1);
        Node res=temp;
        while(a!=null && b!=null){
            if(a.data <= b.data){
                temp.bottom=a;
                temp=temp.bottom;
                a=a.bottom;
            }else{
                temp.bottom=b;
                temp=temp.bottom;
                b=b.bottom;
            }
            
        }
        while(a!=null){
            temp.bottom=a;
        }
        while(b!=null){
            temp.bottom=b;
        }
        return res.bottom;
    }
}