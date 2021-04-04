package loop;

public class SumOfNumbersApp {
      public static void main(String[] args) {

          /*
          System.out.println("===============IF ARGUMENTS ARE INTEGERS===================");

          int integerNumber = 0;
          for (int i = 0; i < args.length; i++){
            // int integerNumber = Integer.parseInt(args[i]);
              integerNumber = integerNumber + Integer.parseInt(args[i]);
          }
          System.out.println(integerNumber);
*/

          System.out.println("==============IF ARGUMENTS ARE DOUBLES====================");

          double doubleNumber = 0;
          for (double j = 0; j < args.length; j++){
              doubleNumber = doubleNumber + Double.parseDouble(args[(int) j]);

          }
          System.out.println(doubleNumber);

    }
}
