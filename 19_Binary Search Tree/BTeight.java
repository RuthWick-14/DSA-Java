class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BTeight {
    public int diameterOfBinaryTree(Node root) {
        int diameter[] = new int[1];
        height (root, diameter);
        return diameter[0];
    }

    private int height(Node node, int[] diameter){
        if (node == null){
            return 0;
        }
        int lh = height (node.left, diameter);
        int rh = height (node.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
