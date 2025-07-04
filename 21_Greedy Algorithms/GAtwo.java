// Minimum Platforms
public class GAtwo {
    public static void dualSort(int[] arr1, int[] arr2) {
        mergeSort(arr1, arr2, 0, arr1.length - 1);
    }

    private static void mergeSort(int[] arr1, int[] arr2, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr1, arr2, left, mid);
            mergeSort(arr1, arr2, mid + 1, right);

            merge(arr1, arr2, left, mid, right);
        }
    }

    private static void merge(int[] arr1, int[] arr2, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L1 = new int[n1];
        int[] R1 = new int[n2];
        int[] L2 = new int[n1];
        int[] R2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            L1[i] = arr1[left + i];
            L2[i] = arr2[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R1[j] = arr1[mid + 1 + j];
            R2[j] = arr2[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L1[i] <= R1[j]) {
                arr1[k] = L1[i];
                arr2[k] = L2[i];
                i++;
            } else {
                arr1[k] = R1[j];
                arr2[k] = R2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr1[k] = L1[i];
            arr2[k] = L2[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr1[k] = R1[j];
            arr2[k] = R2[j];
            j++;
            k++;
        }
    }

    public static int findPlatform(int arr[], int dep[]) {
        // add your code here
        dualSort(arr, dep);
        int n = arr.length;
        int minPlatform = 1;
        int counter = 1;
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] <= dep[i]) {
                counter++;
                minPlatform = Math.max(minPlatform, counter);
            }
            if (arr[i + 1] > dep[i]) counter = 1;
        }
        return minPlatform;
    }
}
