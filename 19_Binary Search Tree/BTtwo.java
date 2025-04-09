class Node {
    int data;
    Node left;
    Node right;

    Node(int data1){
        this.data = data1;
        this.left = null;
        this.right = null;
    }
}

public class BTtwo {
    private static void preorderTraversal(Node root){
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void main(String[] args) {
        
    }
}
