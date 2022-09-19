//Clone a linked list with next and random pointer | Set 2



-------------- using hashmap----------------

public class Solution{
	public Node clone(Node head){
		Node origCurr=head , cloneCurr=null;
		Map<Node , Node> map= new HashMap<>();
		while(origCurr!=null){
			 cloneCurr= new Node(origCurr.data);
			map.put(origCurr,cloneCurr);
			origCurr=origCurr.next;
		}
		
		origCurr=head;
		
		while(origCurr!=null){
			cloneCurr=map.get(origCurr);
			cloneCurr.next=map.get(origCurr.next);
			cloneCurr.random=map.get(origCurr.random);
			origCurr=origCurr.next;
		}
		return map.get(head);
	}
}


time complexcity :  o(n +n)
space complexcity : o(n)


----------------------------------


public class Solution{
	public Node clone(Node head){
		Node iter= head;
		Node front=head;
		
		 // First round: make copy of each node,
          // and link them together side-by-side in a single list.
          while (iter != null) {
            front = iter.next;

            Node copy = new Node(iter.val);
            iter.next = copy;
            copy.next = front;

            iter = front;
          }
		  
		  // Second round: assign random pointers for the copy nodes.
          iter = head;
          while (iter != null) {
            if (iter.random != null) {
              iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
          }
		  
		  // Third round: restore the original list, and extract the copy list.
          iter = head;
          Node pseudoHead = new Node(0);
          Node copy = pseudoHead;

          while (iter != null) {
            front = iter.next.next;

            // extract the copy
            copy.next = iter.next;
            copy = copy.next;

            // restore the original list
            iter.next = front;

            iter = front;
          }

          return pseudoHead.next;
	}
}


time complexcity :  o(n +n)
space complexcity : o(1)