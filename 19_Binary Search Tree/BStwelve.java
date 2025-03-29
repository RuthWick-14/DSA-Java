public class BStwelve {
    public static int maximum(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
            else {
                continue;
            }
        }
        return max;
    }

    public static int totalHours(int[] arr, int hourly){
        int hoursCount = 0;
        for (int i = 0; i < arr.length; i++) {
            hoursCount += (int)(Math.ceil((double)arr[i]/hourly));
        }
        return hoursCount;
    }

    public static int kokoEatBananas(int[] arr, int targetHours){
        // brute force
        // for (int i = 0; i < maximum(arr); i++) {
        //     int reqTime = totalHours(arr, i);
        //     if (reqTime == targetHours) {
        //         return i;
        //     }
        // }
        // return 0;

        //binary search
        int low = 1;
        int high = maximum(arr);
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low+high)/2;
            int hoursCounted = totalHours(arr, mid);
            if (hoursCounted <= targetHours) {
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
        int arr[] = {805306368, 805306368, 805306368};
        System.out.println(kokoEatBananas(arr, 1000000000));
    }
}
