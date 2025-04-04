class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class LLtwo { 
    private static Node convertToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static Node deleteHead(Node head){
        if (head == null) {
            return head;
        }
        head = head.next;
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

    private static Node deleteTail(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node deleteKthElement(Node head, int k){
        if (head == null) {
            return head;
        }
        int counter = 0;
        Node temp = head;
        Node previous = null;
        while (temp != null) {
            counter++;
            if (counter == k){
                previous.next = previous.next.next;
            }
            previous = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8};
        Node head = convertToLL(arr);
        head = deleteHead(head);
        printLinkedList(head);
        head = deleteTail(head);
        printLinkedList(head);
        head = deleteKthElement(head, 2);
        printLinkedList(head);
    }
}
