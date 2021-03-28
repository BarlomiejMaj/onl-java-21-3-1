package loop;

import java.util.Scanner;

public class InputCheckApp {
   // static  String type;
    public static void main(String[] args) {

        String nextLine;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please, enter new text: ");
            nextLine = input.next();
        } while (!nextLine.equalsIgnoreCase("exit"));

        System.out.println("Thank you!");



    }
}
