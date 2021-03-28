package loop;

import java.util.Scanner;

public class SumOfNumbersApp {
    //public static int sum(int a, int b){
      //  return a + b;
   // }

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Please, enter first number: ");
        String a = number.next();
        System.out.print("Please, enter second number: ");
        String b = number.next();
        System.out.print("Please, enter third number: ");
        String c = number.next();

        int integerA = Integer.valueOf(a);
        //integerA = Integer.parseInt(args[0]);

        int integerB = Integer.valueOf(b);
       // integerB = Integer.parseInt(args[0]);

        int integerC = Integer.valueOf(c);
        //integerC = Integer.parseInt(args[0]);

        int sumOfAll = integerA + integerB + integerC;

        System.out.println("Your sum: " + sumOfAll);

        System.out.println("===========================================");


        String d = "111";
        String e = "222";
        String f = "333";

        int integerD = Integer.parseInt("111");
        //int integerD = Integer.parseInt(args[0]);

        int integerE = Integer.parseInt("222");
        //int integerE = Integer.parseInt(args[0]);

        int integerF = Integer.parseInt("333");
        //int integerF = Integer.parseInt(args[0]);

        int sumNextInts = integerD + integerE + integerF;
        System.out.println(sumNextInts);


        System.out.println("============================================");


        String g = "1.11";
        String h = "2.22";
        String i = "3.33";

        double doubleG = Double.parseDouble("1.11");
       //doubleG = Double.parseDouble(args[g]);

        double doubleE = Double.parseDouble("2.22");
        //double doubleE = Double.parseDouble(args[h]);

        double doubleF = Double.parseDouble("3.33");
        //double doubleF = Double.parseDouble(args[0]);

        double sumNextDouble = doubleG + doubleE + doubleF;
        System.out.println(sumNextDouble);




    }
}
