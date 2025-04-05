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
        if (k == 1) {
            head = head.next;
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

    private static Node deleteElement(Node head, int element){
        if (head == null) {
            return head;
        }
        if (head.data == element) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node previous = null;
        while (temp != null) {
            if (temp.data == element){
                previous.next = previous.next.next;
            }
            previous = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node insertHead(Node head, int val){
        return new Node(val, head);
    }

    private static Node insertTail(Node head, int val){
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    public static Node insertKthElement(Node head, int val, int k){
        if (head == null) {
            if (k == 1) {
                return new Node(val);
            }
            return null;
        }
        if (k == 1) {
            return new Node(val);
        }
        int counter = 0;
        Node temp = head;
        Node prev = null;
        Node newNode = new Node(val);

        while (temp != null) {
            counter++;
            if (k == counter) {
                newNode.next = prev.next;
                prev.next = newNode;
            }
            prev = temp;
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
        head = deleteElement(head, 5);
        printLinkedList(head);
        head = insertHead(head, 100);
        printLinkedList(head);
        head = insertTail(head, 120);
        printLinkedList(head);
        head = insertKthElement(head, 10,3);
        printLinkedList(head);
    }
}
