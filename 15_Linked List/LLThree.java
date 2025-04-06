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

    private static Node deleteHead(Node head){
        Node previous = head;
        head = head.next;
        head.back = null;
        previous.next = null;
        return head;
    }

    private static Node deleteLast(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node previous = tail.back;
        previous.next = null;
        tail.back = null;
        return head;
    }

    private static Node deleteKthElement(Node head, int k){
        int counter = 0;
        Node temp = head;
        while (temp != null) {
            counter++;
            if (counter == k) {
                break;
            }
            temp = temp.next;
        }
        Node previous = temp.back;
        Node front = temp.next;
        if (previous == null && front == null) {
            return null;
        }
        else if (previous == null) {
            deleteHead(head);
        }
        else if (front == null) {
            deleteLast(head);
        }
        previous.next = front;
        front.back = previous;
        temp.next = null;
        temp.back = null;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 8, 4};
        Node head = convertNodeToDLL(arr);
        printLinkedList(head);
        head = deleteHead(head);
        printLinkedList(head);
        head = deleteLast(head);
        printLinkedList(head);
        head = deleteKthElement(head, 2);
        printLinkedList(head);
    }
}
