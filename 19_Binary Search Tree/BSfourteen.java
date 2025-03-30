public class BSfourteen {
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

    public static int sumOfDivisor(int[] arr, int number){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (int)Math.ceil((double)arr[i]/number);
        }
        return sum;
    }

    public static int minimumDivisor(int[] arr, int threshold){
        //brute force
        // for (int i = 1; i < maximum(arr)+1; i++) {
        //     int sum = 0;
        //     for (int j = 0; j < arr.length; j++) {
        //         sum += (int)(Math.ceil((double)arr[j]/i));
        //     }
        //     if (sum <= threshold) {
        //         return i;
        //     }
        // }
        // return -1;
        int low = 1;
        int high = maximum(arr);
        int ans = -1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (sumOfDivisor(arr,mid) <= threshold) {
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
        int arr[] = {1,1,1,1,1,3,6,7,100};
        System.out.println(sumOfDivisor(arr, 25));
    }
}
