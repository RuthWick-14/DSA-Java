import java.util.*;

public class recursionThree {

    //print all permutation of string

    public static void printPerm(String str, String permutation){
        if (str.length()==0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }

    //count the total path in a maze to move from (0,0) to (n,m)

    public static int countPaths (int i, int j, int n, int m) {
        if(i==n || j== m) {
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        // move downwards
        int downwards = countPaths(i+1, j, n, m);

        // move rightwards
        int rightwards = countPaths(i, j+1, n, m);

        return downwards + rightwards;
    }

    //Place the tiles of size 1xm in a floor of nxm

    public static int placeTiles (int n, int m) {
        if (n==m) {
            return 2;
        }
        else if (n<m) {
            return 1;
        }
        //vertically
        int vertPlacements = placeTiles(n-m, m);
        //horizontally
        int horiPlacements = placeTiles(n-1,m);

        return vertPlacements + horiPlacements;
    }

    //find the number of ways which you can invite n peoples to your party, single or in pairs

    public static int callGuests (int n){
        if (n<=1) {
            return 1;
        }
        //single call
        int way1 =  callGuests(n-1);
        // pair call
        int way2 = (n-1)*callGuests(n-2);

        return way1+way2;
    }

    // print all possible subset

    public static void printSubset(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){
        if (n==0){
            printSubset(subset);
            return;
        }

        // add
        subset.add(n);
        findSubsets(n-1, subset);

        // add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    public static void main(String[] args) {
        // String str = "abc";
        // printPerm(str, "");

        // int totalPaths = countPaths(0, 0, 3, 3);
        // System.out.println(totalPaths);

        // int n = 4; 
        // int m = 2;
        // int totalTiles = placeTiles(n, m);
        // System.out.println(totalTiles);

        // int n =4;
        // int call = callGuests(n);
        // System.out.println(call);

        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
