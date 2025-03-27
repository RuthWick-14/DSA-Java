import java.lang.reflect.Array;
import java.util.Arrays;

public class BSthree {
    public static int firstOccurance(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;

        while (high >= low) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurance(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;

        while (high >= low) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else{
                high = mid - 1;
            }
        }
        return last;
    }

    public static int[] Occurance(int[] arr, int target) {
        int first = firstOccurance(arr, target);
        int last = lastOccurance(arr, target);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return new int[] { first, last };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 8, 8, 8, 8, 11, 13 };
        // System.out.println(firstOccurance(arr, 8));
        // System.out.println(lastOccurance(arr, 8));
        int[] result = Occurance(arr, 8);
        System.out.println(Arrays.toString(result));
    }
}
