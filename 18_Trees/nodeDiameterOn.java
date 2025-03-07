public class nodeDiameterOn {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    //this will follow the O(n) time complexity.
    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter(Node root){
        if (root == null) {
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int actualHeight = Math.max(left.ht, right.ht) +1;

        int leftDiameter = left.diam; 
        int rightDiameter = right.diam; 
        int lrDiameter = left.ht + left.ht + 1;

        int actualDiameter = Math.max(Math.max(rightDiameter, leftDiameter), lrDiameter);

        TreeInfo Info = new TreeInfo(actualHeight, actualDiameter);
        return Info;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter(root).diam);
    }

}
