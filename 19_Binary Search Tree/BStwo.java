public class BStwo {
    // using iteration
    // public static int lowerBound(int[] arr, int target) {
    //     int low = 0;
    //     int high = arr.length - 1;
    //     int ans = arr.length;
    //     while (low <= high) {
    //         int mid = (low + high) / 2;

    //         if (target <= arr[mid]) {
    //             ans = mid;
    //             high = mid - 1;
    //         } else {
    //             low = mid + 1;
    //         }
    //     }
    //     return ans;
    // }

    // using recursion
    public static int lowerBound(int arr[], int target, int low, int high){
        int ans = arr.length;
        if(low > high){
            return low;
        }
        int mid = (high+low)/2;
        if (arr[mid] >= target ) {
            ans = mid;
            return lowerBound(arr, target, low, mid-1);
        }
        else {
            return lowerBound(arr, target, mid+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5, 8, 8, 10, 10, 11 };
        System.out.println(lowerBound(arr, 4, 0, arr.length-1));
    }
}
