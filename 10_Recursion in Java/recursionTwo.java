import java.util.*;

public class recursionTwo {

    //Tower of hanoi

    public static void towerOfHanoi(int n, String source, String helper, String destination){
        if (n==1) {
            System.out.println("Disk number "+n+" has been transferred from "+source+" to "+destination);
        }
        else {
            towerOfHanoi(n-1, source, destination, helper);
            System.out.println("Disk number "+n+" has been transferred from "+source+" to "+destination);
            towerOfHanoi(n-1, helper, source, destination);
        }
    }

    // print reversed letters i.e. "abcd" -----> "dcba"

    public static void printRev (String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
        }
        else {
            System.out.print(str.charAt(index));
            printRev(str, index-1);
        }
    }

    //find Occurance

    public static int first = -1;
    public static int last = -1;
    public static void findOccurance (String str, int index, char element) {
        if (index == str.length()){
            System.out.println("First : "+first);
            System.out.println("Last : "+last);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == element) {
            if (first == -1){
                first = index;
            }
            else {
                last = index;
            }
        }

        findOccurance(str, index+1, element);
    }
    
    // check if array is sorted (strictly increasing)

    public static boolean isSorted (int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }

        if (arr[index] < arr[index+1]) {
            return isSorted(arr, index+1);
        }
        else {
            return false;
        }
    }

    //move all "x" in the end of the string.

    public static void moveAllX (String str, int index, int count, String newStr) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == 'x') {
            count++;
            moveAllX(str, index+1, count, newStr);
        }
        else {
            newStr += currChar;
            moveAllX(str, index+1, count, newStr);
        }
    }

    //remove duplicates in string

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int index, String newStr) {

        if (index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);

        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, index+1, newStr);
        }
        else{
            newStr += currChar;
            map[currChar- 'a'] = true;
            removeDuplicates(str, index+1, newStr);
        }
    }

    // print all the subsequences of the string
    
    public static void subSequences(String str, int index, String newString) {
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        
        // to be
        char currChar = str.charAt(index);
        subSequences(str, index+1, newString+currChar);
        
        // not to be
        subSequences(str, index+1, newString);
    }
    
    // print all the unique subsequences of the string
    
    public static void uniqueSubSequences(String str, int index, String newString, HashSet<String> set) {
        if(index == str.length()){
            if(set.contains(newString))
            return;
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        
        // to be
        char currChar = str.charAt(index);
        uniqueSubSequences(str, index+1, newString+currChar, set);
        
        // not to be
        uniqueSubSequences(str, index+1, newString, set);
    }

    // print all combination of phone's keypad 

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void prinComb (String str, int index, String combination) {
        if (index == str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(index);
        String mapping = keypad[currChar -'0'];

        for (int i = 0; i < mapping.length(); i++) {
            prinComb(str, index+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");

        // String str = "abcd";
        // printRev(str, str.length()-1);

        // String str = "abaacdaefaah";
        // findOccurance(str, 0, 'a');

        // int[] arr = {1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));

        // String str = "axbxxcd";
        // moveAllX(str, 0, 0,"");

        // String str = "abbcdde";
        // removeDuplicates(str, 0, "");

        // String str = "abc";
        // subSequences(str, 0, "");

        // String str1 = "aaa";
        // HashSet<String> set = new HashSet<>();
        // uniqueSubSequences(str1, 0, "", set);

        String str = "23";
        prinComb(str, 0 , "");
    }
}
