class linklist {
    int val;
    linklist next;
    linklist() {}
    linklist(int val){
        this.val =val;
    }
    linklist(int val, linklist next){
        this.val =val;
        this.next =next;
    }
}


public class ques1 {
    public linklist removeNthNode(linklist head, int n){
        if (head == null) {
            return null;
        }

        int size = 0;
        linklist curr = head;
        while (curr == null) {
            curr =curr.next;
            size++;
        }

        if (n == size) {
            return head.next;`
        }

        int indexToSearch = size - n;
        linklist prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;

    }
    
}
