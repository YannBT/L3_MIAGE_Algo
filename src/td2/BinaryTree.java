package td2; 
/** 
 * @author http://cslibrary.stanford.edu/110/BinaryTrees.html#java 
 */ 
public class BinaryTree { 
    // Root node pointer. Will be null for an empty tree. 
    private Node root; 
  
    /* 
     * --Node-- The binary tree is built using this nested node class. Each node 
     * stores one data element, and has left and right sub-tree pointer which 
     * may be null. The node is a "dumb" nested class -- we just use it for 
     * storage; it does not have any methods. 
     */ 
    private static class Node { 
        Node left; 
        Node right; 
        int data; 
  
        Node(int newData) { 
            left = null; 
            right = null; 
            data = newData; 
        } 
    } 
  
    /** 
     * Creates an empty binary tree -- a null root pointer. 
     */ 
    public BinaryTree() { 
        root = null; 
    } 
  
    /** 
     * TODO: Please implement this method. 
     * @return The maximum depth of this tree. 
     */ 
    public int getMaxDepth() { 
        // Please write your implementation here 
        return 0; 
    } 
  
    /** 
     * Inserts the given data into the binary tree. Uses a recursive helper. 
     */ 
    public void insert(int data) { 
        root = insert(root, data); 
    } 
  
    /** 
     * Recursive insert -- given a node pointer, recur down and insert the given 
     * data into the tree. Returns the new node pointer (the standard way to 
     * communicate a changed pointer back to the caller). 
     */ 
    private Node insert(Node node, int data) { 
        if (node == null) { 
            node = new Node(data); 
        } else { 
            if (data <= node.data) { 
                node.left = insert(node.left, data); 
            } else { 
                node.right = insert(node.right, data); 
            } 
        } 
  
        return (node); 
    } 
} 