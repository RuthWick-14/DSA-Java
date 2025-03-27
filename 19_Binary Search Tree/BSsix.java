public class BSsix {
    public static int minimumRotatedSortedArray(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low+high)/2;
            // all sorted
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }
            //left sorted
            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            //right or all sorted
            else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 0, 1, 2};
        System.out.println(minimumRotatedSortedArray(arr));
    }
}
