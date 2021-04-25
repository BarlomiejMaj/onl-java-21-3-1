package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueSymbols {
    public static void main(String[] args) {

        String symbols = "This is a test text!";

        char[] array = symbols.toCharArray();
        Set<String> uniqueSymbols = new LinkedHashSet<>();

        for (char s : array) {
            uniqueSymbols.add(String.valueOf(s));
        }
        System.out.println(uniqueSymbols);

    }
}
