package loop;

import java.util.Scanner;

public class DiscountCalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please, provide item price: ");
        int price = scanner.nextInt();
        System.out.printf("Please, input customer age: ");
        int age = scanner.nextInt();

        if(age < 6){
            double young = price - price * 0.8;
            System.out.printf("Discounted price is: " + young);
        } else if(age >= 6 && age <= 18){
            double medium = price - price * 0.25;
            System.out.printf("Discounted price is: " + medium);
        } else if(age < 65){
            double old = price - price * 0.3;
            System.out.printf("Discounted price is: " + old);
        } else {
            System.out.printf("Sorry, there is no discount");
            System.out.println("Price is: " + price);
        }


    }
}
