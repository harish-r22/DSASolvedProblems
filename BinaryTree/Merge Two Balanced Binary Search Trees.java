//Merge Two Balanced Binary Search Trees

public class Solution{
	
	public void storeInorderUtil(Node node, ArrayList<Integer> list){
		if(node==null)
			return;
		storeInorderUtil(node.left,list);
		list.add(node.data);
		storeInorderUtil(node.right,list);
	}
	
	public ArrayList<Ineteger> constructListfromTree(Node root){
		ArrayList<Integer> list= new ArrayList<>();
		storeInorderUtil(root,list);
		return list;
	}
	
	public ArrayList<Integer> merge(ArrayList<Integer> list1,ArrayList<Integer> list3,int m, int n){
		ArrayList<Integer> list3= new ArrayList<>();
		int i=0,j=0;
		
		while(i<m && j<n){
			if(list1.get(i)<list2.get(i)){
				list3.add(list1.get(i));
				i++;
			}else{
				list3.add(list2.get(j));
				j++;
			}
		}
		while(i<m){
			list3.add(list1.get(i));
			i++;
		}
		while(j<n){
			list3.add(list2.get(j));
			j++;
		}
		return list3;
	}
	
	public Node convertAlToBst(ArrayList<Integer> list, int low , int high){
		if(low>high)
			return null;
		
		int mid= (start+end)/2;
		Node root= new Node(list.get(mid));
        
        root.left=convertAlToBst(list,low,mid-1);
        root.right=convertAlToBst(list,mid+1,high);
        return root; 		
		
	}
	
 	public Node mergeTrees(Node tree1, Node tree2){
		ArrayList<Integer> list1= constructListfromTree(Node tree1);
		ArrayList<Integer> list2= constructListfromTree(Node tree2);
		
		ArrayList<Integer>list3 = merge(list1, list2, list1.size(), list2.size());
		
		return convertAlToBst(list3, 0, list3.size()-1);
	}
}

time complexcity :o(m+n)
space complexcity: o(m+n)