package loop;

public class WordSplitApp {
    public static void main(String[] args) {

        String word = "Test";

        char[] array = word.toCharArray();
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("=================");

        char[] array2 = word.toCharArray();
        for (char c : array2) {
            System.out.println(c);
        }

        // for this .toCharArray() better is "enhanced for loop"
    }
}
