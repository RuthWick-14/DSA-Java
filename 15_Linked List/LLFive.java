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

public class LLFive {
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

    private static void printLinkedList(Node head) {
        Node temp = head;
        System.out.print("head->");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node SumOfLLs(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummyNode = new Node(-1);
        Node current = dummyNode;
        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null) {
                sum = sum + temp1.data;
            }
            if (temp2 != null) {
                sum = sum + temp2.data;
            }

            Node newNode = new Node(sum % 10);
            carry = sum/10;
            current.next = newNode;
            if (temp1 != null) {
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }
        if (carry != 0) {
            Node newNode = new Node(carry);
            current.next = newNode;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        int arr1[] = {3, 5};
        int arr2[] = {4, 5, 9, 9};
        Node head1 = convertToLL(arr1);
        Node head2 = convertToLL(arr2);
        printLinkedList(head1);
        printLinkedList(head2);
        Node sum = SumOfLLs(head1, head2);
        printLinkedList(sum);
    }
}
