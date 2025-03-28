public class BSeleven {
    public static int xPowerN(int x, int n){
        if (n == 0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        if (n%2==0) {
            return xPowerN(x, n/2)*xPowerN(x, n/2);
        }
        else {
            return x*xPowerN(x, n/2)*xPowerN(x, n/2);
        }
    }
    public static int nthRoot(int root, int number) {
        int low = 1;
        int high = number;

        while (low <= high) {
            int mid = (low+high)/2;
            if (xPowerN(root, mid) == number) {
                return mid;
            }
            else if (xPowerN(root, mid) < number) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(nthRoot(4, 69));
    }
}
