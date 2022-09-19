//Transform to Sum Tree


 public void toSumTree(Node root){
         transFormSumTree(root);
    }
    
    public int transFormSumTree(Node root){
       if(root==null)
          return 0;
          
         int leftTreeValue= transFormSumTree(root.left);
         int rightTreeValue= transFormSumTree(root.right);
         
         int sumValue= root.data+ leftTreeValue + rightTreeValue;
         
         root.data=leftTreeValue + rightTreeValue;
         
         return sumValue;
          
    }

time complexcity : o(n)
space complexcity : o(h)