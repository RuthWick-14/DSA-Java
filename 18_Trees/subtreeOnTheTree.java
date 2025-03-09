public class subtreeOnTheTree {
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

    public static boolean isIdentical(Node root, Node subroot) {
        if (subroot == null && root == null) {
            return true;
        }
        if (subroot == null || root == null) {
            return false;
        }
        if (subroot.data == root.data) {
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
        return false;
    }

    public static boolean isSubtree(Node root, Node subroot) {
        if (subroot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {
        int node1[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int node2[] = { 2, 4, -1, -1, 5, -1, -1 };
        BinaryTree tree = new BinaryTree();
        BinaryTree.idx = -1;
        Node root = tree.buildTree(node1);
        BinaryTree.idx = -1;
        Node subroot = tree.buildTree(node2);
        System.out.println(isSubtree(root, subroot));
    }

}
