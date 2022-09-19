//Sort a linked list of 0s, 1s and 2s

public class Solution{
	public void sortList(){
		int count[] ={0,0,0};
		Node ptr=head;
		while(ptr!=null){
			count[ptr.data]++;
			ptr=ptr.next;
		}
		int i=0;
		ptr=head;
		while(ptr!=null ){
			if(count[i]==0){
				i++;
			}else{
				ptr.data=i;
				--count[i];
				ptr=ptr.next;
				
			}
		}
	}
}