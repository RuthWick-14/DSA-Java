//longest subarray with sum <= k
public class SWTPtwo {
    //brute force -> generate all possible subarrays. by using O(n^2) TC and O(1) SC.
    //better approach
    public static int maximumLengthOfSubstring(int[] arr, int k) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;
        int n = arr.length;

        while (r < n) {
            sum = sum = arr[r];
            while (sum > k) {
                sum = sum - arr[l];
                l = l + 1;
            }
            if (sum <= k) {
                maxLen = Math.max(maxLen, r-l+1);
            }
            r = r + 1;
        }
        return maxLen;
    }

    //optimal solution
}
