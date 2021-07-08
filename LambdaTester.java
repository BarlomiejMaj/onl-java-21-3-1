package java8Features;

import java.util.Locale;
import java.util.function.Function;

public class LambdaTester {
    public static void main(String[] args) {

        String test = "Kross Soil";

        Function<String, String> modifier = parameter -> parameter + " Mountain Bike";
        String result = modifier.apply(test);
        System.out.println(result.toUpperCase(Locale.ROOT));
        System.out.println(result.toLowerCase(Locale.ROOT));
        System.out.println(result.charAt(0));
        System.out.println(result.charAt(result.length()-1));

        System.out.println("================Different approach below: ================");

        System.out.printf("%s to upper case: %s %n", test, modifyString(test, text -> test.toUpperCase(Locale.ROOT)));
        System.out.printf("%s to lower case: %s %n", test, modifyString(test, text -> test.toLowerCase(Locale.ROOT)));
        System.out.printf("From %s only first letter: %s %n", test, modifyString(test, text -> String.valueOf(test.charAt(0))));
        System.out.printf("From %s only first letter: %s %n", test, modifyString(test, text -> String.valueOf(test.charAt(test.length()-1))));



        TextModifier textModifier1 = new TextModModifier() {
            @Override
            public String modifyText(String text) {
                return text;
            }
        };

        System.out.printf("Length of: %s  is: %d%n", test, modifyInt(test, text -> test.length()));
        System.out.printf("Number of words in sentence: %s  is: %d%n", test, modifyInt(test, text -> test.split(" ").length));



    }
    private static String modifyString(String text, Function<String, String> modifier) {
        return modifier.apply(text);
    }

    private static Integer modifyInt(String text, Function<String, Integer> modInteger) {
        return modInteger.apply(text);
    }
}