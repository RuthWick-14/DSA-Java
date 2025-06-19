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

public class BTnine {
        private int maxSum(Node node, int[] max){
        if (node == null){
            return 0;
        }
        int ls = Math.max(0,maxSum(node.left, max));
        int rs = Math.max(0,maxSum(node.right, max));
        max[0] = Math.max(max[0], node.data + ls + rs);
        return node.data+Math.max(ls,rs);
    }
    public int maxPathSum(Node root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        maxSum(root, max);
        return max[0];
    }

}
