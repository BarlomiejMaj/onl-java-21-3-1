package loop;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbersApp {
    public static void main(String[] args) {


        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(0,100);
        }

        System.out.println(Arrays.toString(array));

    }
}
