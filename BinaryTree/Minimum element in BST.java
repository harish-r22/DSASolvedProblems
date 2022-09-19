//Minimum element in BST


class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if(node==null)
          return -1;
        Node curr= node;
        while (curr.left!=null){
            curr=curr.left;
        }
        return curr.data;
    }
}

time complexcity ; o(height of left sub tree)