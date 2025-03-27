public class BSseven {
    public static int numberOfRotations(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            int mid = (low+high)/2;
            // all sorted
            if (arr[low] <= arr[high]){
                ans = arr[low];
                index = low;
                break;
            }
            // left sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;
            }
            else {
                if (arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,1,2,3};
        System.out.println(numberOfRotations(arr));
    }
}
