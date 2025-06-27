import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute
        // in java unordered map like this
        Map<Integer, Integer> mpp = new HashMap<>();
        // in char hashing we use Map<Character, Integer>
        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            //fetch
            System.out.println(mpp.get(number));
        }
    }
}
