public class nodeDiameter {
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = height(root.left);
        int rightNodes = height(root.right);

        int actualheight = Math.max(leftNodes, rightNodes);

        return actualheight+1;
    }

    //this diameter is of O(n^2), i.e. the worst case of n^2
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int lrDiameter = height(root.left) + height (root.right) + 1;

        int realDiameter = Math.max(Math.max(leftDiameter, rightDiameter), lrDiameter);

        return realDiameter;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter(root));
    }
}