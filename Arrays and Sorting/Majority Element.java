//Majority Element


public class Solution{
	public void findMajority(int [] nums){
		int n=nums.length;
		int maxCount=0;
		int index=-1;
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=0;j<n;j++){
				if(nums[i]==nums[j]){
					count++;
				}
				if(count>maxCount){
					maxCount=count;
					index=i;
				}
				
				if(maxCount > n/2){
					System.out.println(""+ nums[index]);
				}
				else{
					System.out.println("No Majority Element");
				}
			}
		}
	}
}

time complexity : o(n2)
space complexity : o(1)


--------------------------------------------------

// Binary tree

public class Node{
		int key;
		int count=0;
		Node right, left;
	}
	
public class Solution{
	
	static int ma = 0;
	static Node newNode(int item){
		Node temp= new Node();
		temp.key=item;
		temp.count=1
		temp.left=null;
		temp.right=null;
		return temp;
	}
	
	static Node insert(Node node , int key){
		if(node ==null){
			 if (ma == 0)
            ma = 1;
 
         return newNode(key);
		}
		 if (key < node.key)
        node.left = insert(node.left, key);
         else if (key > node.key)
        node.right = insert(node.right, key);
         else
         node.c++;
	    ma = Math.max(ma, node.c);
	     return node;
		 
	}
	
	static void inorder(Node root, int s)
{
    if (root != null)
    {
        inorder(root.left, s);
 
        if (root.c > (s / 2))
            System.out.println(root.key + "\n");
 
        inorder(root.right, s);
    }
}
	public static void main(String[] args)
    {
    int a[] = { 1, 3, 3, 3, 2 };
    int size = a.length;
    Node root = null;
     
    for(int i = 0; i < size; i++)
    {
        root = insert(root, a[i]);
    }
     
    // Function call
    if (ma > (size / 2))
        inorder(root, size);
    else
        System.out.println("No majority element\n");
   }
}

// time complexity : o(n2)
//space complexity : o(n)


//METHOD 3 (Using Moore’s Voting Algorithm): 

// method 4 usinh hash map


public class Solution{
	public void findMajority(int [] nums){
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<n;i++){
			if(map.containsKey(nums[i])){
				int count=map.get(nums[i])+1;
				if(count > nums.length/2){
					 System.out.println("Majority found :- " + arr[i]);
                        return;
				}
				map.put(nums[i],count);
			}else{
				map.put(nums[i],1);
			}
		}
	}
}


Time Complexity: O(n). 
One traversal of the array is needed, so the time complexity is linear.
Auxiliary Space: O(n). 
Since a hashmap requires linear space.


public class SOlution{
	public int  findMajority(int [] nums){
		int n=nums.length;
      Arrays.sort(nums);
	  int count=0, maxElement=-1,ele=0,temp=nums[0],f=0;
	  for(int i=0;i<n;i++){
		  if(temp==nums[i]){
			  count++;
		  }else{
			  count=1;
			  temp=nums[i];
		  }
		  if(maxCount<count){
			  maxCount=count;
			  ele=nums[i];
			  if(maxCount> n/2){
				  f=1;
				  break;
			  }
		  }
	  }
	  return (f==1) ? ele :-1;
	}
}