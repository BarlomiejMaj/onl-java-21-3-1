package algorithms;

public class FibonacciSequence{
    private static int isFibonacci(int i) {

        if (i == 0) {
            return 0;
        }
        if (i <= 2){
            return 1;
        }
        return isFibonacci(i-2) + isFibonacci(i-1);

    }

    public static void main(String[] args) {

        int i = 0;
        for(i = 0; i <= 9; i++ ){

            System.out.println(isFibonacci(i));
        }
    }


}
