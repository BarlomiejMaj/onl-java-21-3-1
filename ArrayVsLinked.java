package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayVsLinked {
    public static void main(String[] args) {

        long startArray = System.currentTimeMillis();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <= 100_000; i++){
            numbers.add(0, i);
            //System.out.println(i);
        }
        long endArray = System.currentTimeMillis() - startArray;
        System.out.println(endArray + "ms needed for Array List");
        System.out.println("=========================");


        long startLinked = System.currentTimeMillis();
        LinkedList<Integer> values = new LinkedList<>();
        for(int j = 0; j <= 100_000; j++){
            values.add(0, j);
            //System.out.println(j);
        }
        long endLinked = System.currentTimeMillis() - startLinked;
        System.out.println(endLinked + "ms needed for Linked List");
        System.out.println("=========================");



        long startArray2 = System.currentTimeMillis();
        for(int i = 1; i <= 100_000; i++){
            numbers.get(i);
        }
        long endArray2 = System.currentTimeMillis() - startArray2;
        System.out.println(endArray2 + "ms needed for Array List with 'get' from previous");
        System.out.println("=========================");



        long startLinked2 = System.currentTimeMillis();
        for(int j = 1; j <= 100_000; j++){
            values.get(j);
        }
        long endLinked2 = System.currentTimeMillis() - startLinked2;
        System.out.println(endLinked2 + "ms needed for Linked List with 'get' from previous");
        System.out.println("=========================");


        // In the Array list if we are adding new item to the list, we are shifting all the elements into right side what takes more time.
        // so in first case this take more time than for Linked List


        // In the Linked list if we are adding new item (new cell), we are creating new link between currently existing parts and new one (looks like connection without moving all the items)
        // but slow for the Linked list is accessing elements by index, so if index is 100_000 as in this case we are going link by link (element by element) 100_000 times to the moment of last (or searching) index
    }
}
