public class BSnine {
    public static int peakValue(int[] arr) {
        // brute force
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr.length == 1) {
        //         return 0;
        //     }
        //     if (i == 0) {
        //         if (arr[i] > arr[i + 1]) {
        //             return i;
        //         }
        //     } 
        //     else if (i == arr.length - 1) {
        //         if (arr[i] > arr[i - 1]) {
        //             return i;
        //         }
        //     } 
        //     else {
        //         if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
        //             return i;
        //         }
        //     }
        // }
        // return -1;

        //using binary search for one peak elements
        // if (arr.length == 1) {
        //     return 0;
        // }
        // if (arr[0] > arr[1]) {
        //     return 0;
        // }
        // if (arr[arr.length-1] > arr[arr.length - 2]) {
        //     return arr.length-1;
        // }
        // int low = 1;
        // int high = arr.length - 2;

        // while (low <= high) {
        //     int mid = (low+high)/2;
        //     if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
        //         return mid;
        //     }
        //     else if (arr[mid] > arr[mid-1]) {
        //         low = mid + 1;
        //     }
        //     else if (arr[mid] > arr[mid+1]) {
        //         high = mid - 1;
        //     }
        // }
        // return -1;

        //using binary search for multiple peak elements
        if (arr.length == 1) {
            return 0;
        }
        if (arr[0] > arr[1]) {
            return 0;
        }
        if (arr[arr.length-1] > arr[arr.length - 2]) {
            return arr.length-1;
        }
        int low = 1;
        int high = arr.length - 2;

        while (low <= high) {
            int mid = (low+high)/2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                return mid;
            }
            else if (arr[mid] > arr[mid-1]) {
                low = mid + 1;
            }
            else if (arr[mid] > arr[mid+1]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 8, 7, 6, 5, 1 };
        System.out.println(peakValue(arr));
    }
}
