public class BSfifteen {
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

    public static int sumOfWeight(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int daysRequired(int[] arr, int weight){
        int day = 1;
        int load = 0;

        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] > weight) {
                day = day + 1;
                load = arr[i];
            }
            else {
                load += arr[i];
            }
        }
        return day;
    }

    public static int minimumCapacity(int[] arr, int days){
        //brute force
        // int max = maximum(arr);
        // int sum = sumOfWeight(arr);
        // for (int i = max; i < sum+1; i++) {
        //     int dayReq = daysRequired(arr, i);
        //     if (dayReq <= days) {
        //         return i;
        //     }
        // }
        // return -1;

        //binary search
        int low = maximum(arr);
        int high = sumOfWeight(arr);
        int ans = -1;

        while (low <= high) {
            int mid = (low+high)/2;
            int numOfDays = daysRequired(arr, mid);
            if (numOfDays <= days) {
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
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(minimumCapacity(arr, 5));
    }
}
