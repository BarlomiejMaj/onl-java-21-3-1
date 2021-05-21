package algorithms;

import java.util.Arrays;

public class SelectionSort {
    void selectionSort(int array[]) {

        int a = array.length;
        int MIN;

        for(int i = 0; i < a; i++){
            MIN = i;
            for(int j = i + 1; j < a; j++)
                if(array[j] < array[MIN])
                    MIN = j;
                int tmp = array[MIN];
                array[MIN] = array[i];
                array[i] = tmp;
        }
    }

    public static void main(String[] args) {

        SelectionSort sort = new SelectionSort();
        int array[] = {6, 2, 61, 22, 53, 47, 90, 41, 33, 55, 16};

        sort.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

}
