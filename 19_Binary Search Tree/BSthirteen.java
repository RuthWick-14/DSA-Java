public class BSthirteen {
    public static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
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
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } 
            else {
                continue;
            }
        }
        return min;
    }

    public static boolean isPossible(int[] arr, int days, int m, int k) {
        int counter = 0;
        int numberOfBouquets = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                counter++;
            } 
            else {
                numberOfBouquets += counter / k;
                counter = 0;
            }
        }
        numberOfBouquets += counter / k;
        if (numberOfBouquets >= m) {
            return true;
        } 
        else {
            return false;
        }
    }

    public static int minimumDays(int[] arr, int m, int k) {
        // brute force
        // for (int i = minimum(arr); i < maximum(arr)+1; i++) {
        //     if (isPossible(arr, i, m, k)) {
        //         return i;
        //     }
        // }
        // return -1;

        if (m * k > arr.length) {
            return -1;
        }
        int low = minimum(arr);
        int high = maximum(arr);
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(arr, mid, m, k) == true) {
                ans = mid;
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 7, 7, 7, 13, 11, 12, 7 };
        System.out.println(minimumDays(arr, 2, 3));
    }
}
