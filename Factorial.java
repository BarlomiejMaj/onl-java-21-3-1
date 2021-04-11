package algorithms;

public class Factorial {
    private static int isFactorial(int i){

        if (i <= 0) {
            return 1;
        } else {
            return (i * isFactorial(i-1));
        }


    }

    public static void main(String[] args) {

        int i = 0;
        for(i = 0; i <= 10; i++ ){

            System.out.println(isFactorial(i));
        }
    }
}

