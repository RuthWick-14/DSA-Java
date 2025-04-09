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
public class BTfour {
    private static void postorderTraversal(Node root){
        if (root == null) {
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        
    }
}
