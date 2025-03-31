public class BSseventeen {
    public static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } 
            else {
                continue;
            }
        }
        return max;
    }

    public static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } 
            else {
                continue;
            }
        }
        return min;
    }

    public static boolean canPlace(int[] arr, int distance, int cows){
        int countCows = 1;
        int last = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - last >= distance) {
                countCows++;
                last = arr[i];
            }
        }
        if (countCows >= cows) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int maxOfMinDistance(int[] arr, int cows){
        //brute force
        // for (int i = 0; i < (maximum(arr)-minimum(arr)); i++) {
        //     if (canPlace(arr, i, cows) == true) {
        //         continue;
        //     }
        //     else{
        //         return i-1;
        //     }
        // }
        // return -1;

        // binary search
        int low = 1;
        int high = maximum(arr)-minimum(arr);
        int ans = -1;
         
        while (low <= high) {
            int mid = (low+high)/2;
            if (canPlace(arr, mid, cows) == true) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {0, 3, 4, 7, 9, 10};
        System.out.println(maxOfMinDistance(arr, 4));
    }
}