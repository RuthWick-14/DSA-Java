public class BSten {
    public static int squareRoot(int number){
        //brute force
        // int ans = -1;
        // for (int i = 0; i <= number; i++) {
        //     if (i*i <= number) {
        //         ans = i;
        //         continue;
        //     }
        //     else {
        //         break;
        //     }
        // }
        // return ans;

        // using binary search
        int ans = -1;
        int low = 0;
        int high = number;

        while (low <= high) {
            int mid = (low+high)/2;
            if (mid*mid <= number) {
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
        System.out.println(squareRoot(25));
    }
}
