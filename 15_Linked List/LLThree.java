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

public class LLThree {
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
        int arr[] = {3, 5, 1, 8, 4};
        Node head = convertNodeToDLL(arr);
        printLinkedList(head);
    }
}
