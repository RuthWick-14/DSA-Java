public class BSfour {
    public static int searchRotatedSortArray(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (low+high)/2;
            if (arr[mid] == target) {
                return mid;
            }
            //left sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            //right sorted
            else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        System.out.println(searchRotatedSortArray(arr, 1));
    }
}
