public class BSfive {
    public static int searchRotatedSortArrayDuplicate(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (low+high)/2;
            if (arr[mid] == target) {
                return mid;
            }
            //if arr[low]=arr[mid]=arr[high]
            if (arr[low]==arr[mid] && arr[mid]==arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
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
        int arr[] = {3, 1, 2, 3, 3, 3, 3};
        System.out.println(searchRotatedSortArrayDuplicate(arr, 3));
    }
}