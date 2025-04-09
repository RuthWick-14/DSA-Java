import java.util.*;
;
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

public class LLSix {
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

    private static Node oddEvenLL(Node head){
        //brute force
        // if (head == null || head.next == null) {
        //     return head;
        // }
        // List<Integer> arr = new ArrayList<>();
        // Node temp = head;
        // while (temp != null) {
        //     arr.add(temp.data);
        //     if (temp.next == null) break;
        //     temp = temp.next.next;
        // }
        // if (temp != null) {
        //     arr.add(temp.data);
        // }
        // temp = head.next;
        // while (temp != null) {
        //     arr.add(temp.data);
        //     if (temp.next == null) break;
        //     temp = temp.next.next;
        // }        
        // if (temp != null) {
        //     arr.add(temp.data);
        // }
        // int i = 0;
        // temp = head;
        // while (temp != null) {
        //     temp.data = arr.get(i);
        //     i++;
        //     temp = temp.next;
        // }
        
        //optimized code
        if (head == null || head.next == null) {
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 5, 6};
        Node head = convertToLL(arr);
        printLinkedList(head);
        head = oddEvenLL(head);
        printLinkedList(head);
    }
}
