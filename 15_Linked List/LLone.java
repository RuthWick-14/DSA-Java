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

public class LLone {
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

    private static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    private static boolean isPresent(Node head, int val){
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8};
        Node head = convertToLL(arr);
        Node temp = head;
        
        System.out.print("head->");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");

        System.out.println();

        System.out.println(lengthOfLL(head));

        System.out.println(isPresent(head, 5));
    }
}
