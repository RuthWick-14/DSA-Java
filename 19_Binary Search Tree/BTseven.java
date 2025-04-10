import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

public class BTseven {
    private static  List<Integer> inorderTraversal(Node root){
        List<Integer> inorder = new ArrayList<Integer>();
        Stack<Node> st = new Stack<Node>();
        st.push(root);
        Node node = root;
        while (true) {
            if (node != null){
                st.push(node);
                node = node.left;
            }
            else {
                if (st.isEmpty()) {
                    break;
                }
                node = st.pop();
                inorder.add(node.data);
                node = node.right;
            }
        }
        return inorder;
    }
}
