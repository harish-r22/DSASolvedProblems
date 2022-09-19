//Remove duplicates from the Linked List

public class Solution{
	public void removeDuplicates(){
		Node ptr1 =null , ptr2=null;
       ptr1=head;
       while(ptr1!=null && ptr1.next!=null){
       ptr2=ptr1;
       while( ptr2.next!=null){
           if(ptr1.data == ptr2.next.data){
               ptr1.next=ptr2.next.next;
               System.gc();
           }else{
               ptr2=ptr2.next;
           }
        
       }
       ptr1=ptr1.next;
    }
    return head;
	}
}

time complexcty : o(n2)
space complexcty: o(1);


------------------------------------------------
//using Hashset

public class Solution{
	public Node removeDuplicates(){
		HashSet<Integer> set= new HashSet<>();
		Node current=head;
		Node prev=null;
		while(current!=null){
			int currentVal= current.value;
			if(set.contains(currentVal)){
				prev.next=current.next;
			}else{
				set.add(currentVal);
				prev=current;
			}
			current=current.next;
		}
		return head;
	}
}
time complexcty : o(n)
space complexcty: o(n);

----------------------

//only if list is sorted

public class Solution{
   public Node removeDuplicates(){
	Node ptr=head;
	while(ptr!=null && ptr.next!=null){
		if(ptr.value==ptr.next.value){
			ptr.next=ptr.next.next;
		}else
			ptr=ptr.next;
	}
	return head;
   }
	
}


