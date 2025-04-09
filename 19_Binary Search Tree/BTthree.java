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

public class BTthree {
    private static void inorderTraversal(Node root){
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        
    }
}
