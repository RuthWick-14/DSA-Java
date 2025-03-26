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

    //using iteration
    // public static int upperBound(int[] arr, int target){
    //     int low = 0;
    //     int high = arr.length-1;
    //     int ans = arr.length;

    //     while (high >= low) {
    //         int mid = (low+high)/2;
    //         if (arr[mid] > target) {
    //             ans = mid;
    //             high = mid - 1;
    //         }
    //         else {
    //             low = mid + 1;
    //         }
    //     }
    //     return ans;
    // }

    //using recursion
    public static int upperBound(int[] arr, int target, int low, int high){
        int ans = arr.length;

        if (low > high) {
            return low;
        }
        int mid = (high+low)/2;
        if (arr[mid] > target){
            ans = mid;
            return upperBound(arr, target, low, mid-1);
        }
        else {
            return upperBound(arr, target, mid+1, high);
        }
    }

    public static int ceil(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (target <= arr[mid]) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int floor(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;

        while (high >= low) {
            int mid = (high+low)/2;
            if (arr[mid] <= target){
                ans =mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5, 8, 8, 10, 10, 11 };
        int nums[] = {10, 20, 30, 40, 50};
        System.out.println(lowerBound(arr, 9, 0, arr.length-1));
        System.out.println(upperBound(arr, 10, 0, arr.length-1));
        System.out.println(floor(nums, 35));
    }
}
