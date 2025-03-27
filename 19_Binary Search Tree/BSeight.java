public class BSeight {
    public static int singleElementInSortedArray(int[] arr) {
        // brute force
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr.length == 1) {
        //         return arr[0];
        //     }
        //     if (i == 0) {
        //         if (arr[i] != arr[i + 1]) {
        //             return arr[i];
        //         }
        //     }
        //     else if (i == arr.length-1){
        //         if (arr[i] != arr[i-1]) {
        //             return arr[i];
        //         }
        //     }
        //     else {
        //         if (arr[i] != arr[i+1] && arr[i] != arr[i-1]) {
        //             return arr[i];
        //         }
        //     }
        // }
        // return -1;

        if (arr.length == 1) {
            return arr[0];
        }
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[arr.length-1] != arr[arr.length-2]) {
            return arr[arr.length-1];
        }

        int low = 1;
        int high = arr.length - 2;

        while (low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                return arr[mid];
            }
            // left half elimination
            if(((mid%2==1) && arr[mid] == arr[mid-1]) || ((mid%2==0) && arr[mid] == arr[mid+1])){
                low = mid + 1;
            }
            // right half elimination
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        System.out.println(singleElementInSortedArray(arr));
    }
}
