public class initialSearchSpace {
    public static int initialSearch(int arr[], int target, int high, int low){
        int size = arr.length;
        low = 0;
        high = size-1;

        while (high>=low) {
            int mid = (low+high)/2;
            if (target == arr[mid]) {
                return mid;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 6, 7, 9, 12, 16, 17 };
        System.out.println(initialSearch(arr, 12, arr.length, 0));
    }
}