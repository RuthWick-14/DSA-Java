public class BSsixteen {
    public static int missingNumber(int[] arr, int K){
        //brute force
        // for (int i = 0; i < arr.length; i++){
        //     if (arr[i] <= K){
        //         K++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return K;

        // binary search
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low+high)/2;
            int missing = arr[mid] - (mid + 1);
            if (missing < K) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low+K;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 7, 11};
        System.out.println(missingNumber(arr, 5));
    }
}
