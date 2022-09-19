//Space optimization using bit manipulations

//Given two numbers say a and b, mark the multiples of 2 and 5 between a and b using less than O(|b – a|) space and output each of the multiples. 


public class Solution{
   public static void main(String[] args)
    {
		int a=2, b=10;
		int size=Math.abs(b-a)+1;
		int [] array=new int[size];
		for(int i=a;i<=b;i++){
			if(i%2==0 && i%5==0){
				array[i-a]=1;
			}
		}
		
		for(int i=a;i<=b;i++){
			if(array[i-a]==1){
				System.out.println(i + "");
			}
		}
	}
}
Save memory, by translating a to 0th index and b to (b-a)th index. 
Space complexity : O(|b-a|)



Approach 3 (Using Bit Manipulations):

 Find the actual index in int[] that needs to be bit manipulated it will be bitwise index/ 32.
 Find the index of bit in those 32 bits that needs to be turned on it will be bitwise index % 32.  Let’s Call it X
 Turn on the bit by doing | (bitwise OR) with (1 << X) (here we turn on the Xth bit by bit manipulation)
 To get the value of a bit at a bitwise index we calculate the same indices and do a bitwise & so that if Xth bit is on it will return an integer not equal to 0 which is true in C++.
Now instead of using arithmetic operators we can use bitwise operations for efficiency

// Java code to for marking multiples

class GFG
{
    // index >> 5 corresponds to dividing index by 32
    // index & 31 corresponds to modulo operation of
    // index by 32
 
    // Function to check value of bit position whether
    // it is zero or one
    static boolean checkbit(int array[], int index)
    {
            int val = array[index >> 5] & (1 << (index & 31));
            if (val == 0)
                return false;
            return true;
    }
 
    // Sets value of bit for corresponding index
    static void setbit(int array[], int index)
    {
            array[index >> 5] |= (1 << (index & 31));
    }
 
    // Driver code
    public static void main(String args[])
    {
            int a = 2, b = 10;
            int size = Math.abs(b-a);
 
            // Size that will be used is actual_size/32
            // ceil is used to initialize the array with
            // positive number
            size = (int)Math.ceil((double)size / 32);
 
            // Array is dynamically initialized as
            // we are calculating size at run time
            int[] array = new int[size];
 
            // Iterate through every index from a to b and
            // call setbit() if it is a multiple of 2 or 5
            for (int i = a; i <= b; i++)
                if (i % 2 == 0 || i % 5 == 0)
                    setbit(array, i - a);
 
            System.out.println("MULTIPLES of 2 and 5:");
            for (int i = a; i <= b; i++)
                if (checkbit(array, i - a))
                    System.out.print(i + " ");
    }
}
 

