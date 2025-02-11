import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        // Integer | String | Float | Boolean
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(2);
        list.add(7);
        list.add(5);
        System.out.println(list);

        //get element of specific index
        System.out.println(list.get(2));

        //insert element in between
        list.add(1,3);
        System.out.println(list);

        // delete element of specific index
        list.remove(2);
        System.out.println(list);

        //get size of array list
        System.out.println(list.size());

        //we can set element of specific index 
        list.set(1, 7);
        System.out.println(list);

        //we can run loop in arraylist just like array
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //we can sort array in ascending using collection framework in java
        Collections.sort(list);
        System.out.println(list);
    }
}
