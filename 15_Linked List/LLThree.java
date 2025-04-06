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

    private static void deleteNode(Node temp){
        Node previous = temp.back;
        Node front = temp.next;
        if (front == null) {
            previous.next = null;
            temp.back = null;
            return;
        }
        previous.next = front;
        front.back = previous;
        temp.next = temp.back = null;
    }

    private static Node insertBeforeHead(Node head, int val){
        Node newHead = new Node(val, head, null);
        head.back = newHead;
        return newHead;
    }

    private static Node insertAfterLast(Node head, int val){
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        newNode.back = temp;
        return head;
    }

    private static Node insertBeforeLast(Node head, int val){
        if (head.next == null) {
            return insertBeforeHead(head, val);
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node previous = tail.back;
        Node newNode = new Node(val, tail, previous);
        previous.next = newNode;
        tail.back = newNode;
        return head;
    }

    private static Node insertBeforeKthElement(Node head, int k, int val){
        if (k == 1) {
            return insertBeforeHead(head, val);
        }
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            if (counter == k) {
                break;
            }
            temp = temp.next;
        }
        Node previous = temp.back;
        Node newNode = new Node(val, temp, previous);
        previous.next = newNode;
        temp.back = newNode;
        return head;
    }

    private static void insertBeforeNode(Node node, int val){
        Node previous = node.back;
        Node newNode = new Node(val, node, previous);
        previous.next = newNode;
        node.back = newNode;
        return;
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
        deleteNode(head.next);
        printLinkedList(head);
        head = insertBeforeHead(head, 10); 
        printLinkedList(head);
        head = insertAfterLast(head, 13);
        printLinkedList(head);
        head = insertBeforeLast(head, 21);
        printLinkedList(head);
        head = insertBeforeKthElement(head, 2, 14);
        printLinkedList(head);
        insertBeforeNode(head.next.next, 100);
        printLinkedList(head);
    }
}
