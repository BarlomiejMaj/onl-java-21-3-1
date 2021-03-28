package loop;

import java.util.Scanner;

public class SumOfNumbersApp {
      public static void main(String[] args) {


          int integerNumberA = Integer.parseInt("123");
          integerNumberA = Integer.parseInt(args[0]);

          int integerNumberB = Integer.parseInt("456");
          integerNumberB = Integer.parseInt(args[1]);

          int integerNumberC = Integer.parseInt("789");
          integerNumberC = Integer.parseInt(args[2]);

          int sumOfAllIntegers = integerNumberA + integerNumberB + integerNumberC;

          System.out.println(sumOfAllIntegers);


          System.out.println("==================================");


          double doubleNumberA = Double.parseDouble("1.23");
          doubleNumberA = Double.parseDouble(args[3]);

          double doubleNumberB = Double.parseDouble("4.56");
          doubleNumberB = Double.parseDouble(args[4]);

          double doubleNumberC = Double.parseDouble("7.89");
          doubleNumberC = Double.parseDouble(args[5]);

          double sumOfAllDoubles = doubleNumberA + doubleNumberB + doubleNumberC;

          System.out.println(sumOfAllDoubles);
    }
}
