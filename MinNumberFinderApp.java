package loop;

public class MinNumberFinderApp {

    public static void main(String[] args) {
        int[] arrayMin = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arrayMin[i]  = Integer.parseInt(args[i]);

        }


        int min = arrayMin[0];

        for (int i = 0; i < arrayMin.length; i++) {
            if (arrayMin[i] < min) {
                min = arrayMin[i];
            }
        }

        System.out.println(min);

    }
}
