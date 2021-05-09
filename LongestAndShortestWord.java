package algorithms;

import java.util.Arrays;
import java.util.List;

public class LongestAndShortestWord {
    public static void main(String[] args) {

        String sentence = "For given text find the longest and the shortest words";

        List<String> word = Arrays.asList(sentence.split(" "));

        String longestWord = "";
        for (String oneWord : word) {
            if (oneWord.length() > longestWord.length()) {
                longestWord = oneWord;
            }
        }
        System.out.println(longestWord);


        String shortestWord = longestWord;
        for (int i = 1; i <= shortestWord.length(); i++) {
            for (String oneWord : word) {
                if (oneWord.length() < shortestWord.length()) {
                    shortestWord = oneWord;
                }
//                 if (oneWord.length() == shortestWord.length()) {
//                        word.add(oneWord);
//                    }
            }
            System.out.println(shortestWord);
        }



//        int shortestLength = 0;
//        for (String str : args) {
//            int length = str.length();
//            if (length > shortestLength) {
//                shortestLength = length;
//                word.clear();
//            }
//            if (length == shortestLength) {
//                word.add(str);
//            }
//        }
//        System.out.println(word.get(shortestLength));
    }
}


