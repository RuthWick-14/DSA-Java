//create basics heap class 
class Heap {
    public int[] arr = new int[100];
    public int size = 0;

    Heap() {
        arr[0] = -1;
        size = 0;
    }

    void insert(int val) {
        size = size + 1;
        int index = size;
        arr[index] = val;

        while (index > 1) {
            int parent = index/2;

            if(arr[parent] < arr[index]) {
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                index = parent;
            }
            else return;
        }
    }

    void print() {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != 0) System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class Heapone {
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.insert(50);
        hp.insert(55);
        hp.insert(53);
        hp.insert(52);
        hp.insert(54);
        hp.print();
    }
}
