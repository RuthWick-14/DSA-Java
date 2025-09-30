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

    void deleteFromHeap() {
        if(size == 0) {
            System.out.println("Nothing to delete.");
            return;
        }
        //Step-1 :-> Put last element into first index
        arr[1] = arr[size];
        size--;

        //Step-2 :-> take node to its correct position
        int i = 1;
        while (i <= size) {
            int leftIdx = 2*i;
            int rightIdx = 2*i+1;

            if(leftIdx < size && arr[i] < arr[leftIdx]) {
                int temp = arr[i];
                arr[i] = arr[leftIdx];
                arr[leftIdx] = temp;
                i = leftIdx;
            }
            else if(rightIdx < size && arr[i] < arr[rightIdx]) {
                int temp = arr[i];
                arr[i] = arr[rightIdx];
                arr[rightIdx] = temp;
                i = rightIdx;
            }
            else return;
        }
    }

    void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class Heapone {
    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2*i;
        int right = 2*i+1;

        if (left < n && arr[largest] < arr[left]) {
            largest = left;
        }
        if (right < n && arr[largest] < arr[right]) {
            largest = right;
        }
        if(largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.insert(50);
        hp.insert(55);
        hp.insert(53);
        hp.insert(52);
        hp.insert(54);
        hp.print();
        hp.deleteFromHeap();
        hp.print();

        int arr[] = {-1, 54, 53, 55, 52, 50};
        int n = 5;
        for (int i = n/2; i > 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
