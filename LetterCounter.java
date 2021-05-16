package algorithms;

public class LetterCounter {
    public static void main(String[] args) {

       String sentence = "This is a test text";
       int count = 0;
       char letter;

       for(letter = 'a'; letter <= 'z'; letter++){
           for(int i = 0; i < sentence.length(); i++){
               if(sentence.charAt(i) == letter){
                   count++;
               }
           }
           if(count > 0){
               System.out.print(letter + " - " + count + ", ");
               count = 0;
           }
       }
    }
}