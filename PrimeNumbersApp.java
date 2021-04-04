package loop;

public class PrimeNumbersApp {
    public static void main(String[] args) {


        int i = 1;

            while (i <= 100) {
                int j = 0;
                int start = 2;
                while (start <= i / 2){

                   // for (int j = 2; i <= i / 2; i++) {
                        if (i % start == 0) {
                            j++;
                            break;
                        }
                        start++;
                  //  }
                }

                if (j == 0 && i != 1) {
                    System.out.println(i + " ");
                }
                i++;
            }
    }
}
