package algorithms;

import java.util.Arrays;

public class BubbleSort {
    void bubbleSort(int array[]) {

        int a = array.length;
        for(int i = 0; i < a; i++){
            for(int j = 1; j < (a-1); j++){
                if(array[j-1] > array[j]){
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }


    }

    public static void main(String[] args) {
        BubbleSort bbSort = new BubbleSort();
        int array[] = {6, 2, 61, 22, 53, 47, 90, 41, 33, 55};

        bbSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));


    }
}

