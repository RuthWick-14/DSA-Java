public class BSeighteen {
    public static int sumOfPages(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

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

    public static int numberOfStudents(int[] arr, int pages){
        int student = 1;
        int pagesStudent = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            }
            else {
                student++;
                pagesStudent = arr[i];
            }
        }
        return student;
    }

    public static int minOfMaxPages(int[] arr, int students){
        //brute force
        // int low = maximum(arr);
        // int high = sumOfPages(arr);

        // for (int pages = low; pages < high+1; pages++) {
        //     int countStudent = numberOfStudents(arr, pages);
        //     if (countStudent == students) {
        //         return pages;
        //     }
        // }
        // return -1;

        int low = maximum(arr);
        int high = sumOfPages(arr);
        int ans = -1;

        while (low <= high) {
            int mid = (low+high)/2;
            int countStudent = numberOfStudents(arr, mid);
            if (countStudent > students) {
                low = mid + 1;
                ans = low;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {25, 46, 28, 49, 24};
        System.out.println(minOfMaxPages(arr, 4));
    }
}
