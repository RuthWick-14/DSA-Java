public class linkedList {

    Node head;
    private int size;

    linkedList(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first or add last

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        if (currNode.next !=  null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //delete first list
    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last list

    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;  // head.next = null -> lastNode = null
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    //print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+ " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //print size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.printList();
        list.addFirst("This"); 
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
