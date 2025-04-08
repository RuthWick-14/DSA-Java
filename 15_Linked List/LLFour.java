import java.util.Stack;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class LLFour {
    private static Node convertNodeToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node previous = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null,previous);
            previous.next = temp;
            previous = temp;
        }
        return head;
    }

    private static Node reverseDLL(Node head){
        //brute force
        // Node temp = head;
        // Stack<Integer> st = new Stack<>();
        // while (temp != null) {
        //     st.push(temp.data);
        //     temp = temp.next;
        // }
        // temp = head;
        // while (temp != null) {
        //     temp.data = st.peek();
        //     st.pop();
        //     temp = temp.next;
        // }
        // return head;

        // optimized code
        if (head == null || head.next == null) {
            return head;
        }
        Node last = null;
        Node current = head;
        while (current != null) {
            last = current.back;
            current.back = current.next;
            current.next = last;
            current = current.back;
        }
        return last.back;
    }

    private static void printLinkedList(Node head) {
        Node temp = head;
        System.out.print("head->");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int arr[] = {3, 7, 1, 10, 14, 27};
        Node head = convertNodeToDLL(arr);
        printLinkedList(head);
        head = reverseDLL(head);
        printLinkedList(head);
    }
}

