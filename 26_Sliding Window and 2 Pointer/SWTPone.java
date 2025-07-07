public class SWTPone {
    //constant window
    //Max sum of array with window k
    //brute force
    private static int sum(int[] arr, int k) {
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += arr[i];
        }
        return ans;
    }

    public static int maxSum(int[] arr, int k){
        int sum = sum(arr, k);
        int maxSum = sum;
        int l = 0;
        int r = k - 1;
        int n = arr.length;
        while (r < n-1) {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
