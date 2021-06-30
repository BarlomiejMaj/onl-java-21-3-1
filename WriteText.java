package writeFile;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class WriteText {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("Hello File World!", "This is Sparta!", "New line");
        String fileName = "C:\\Users\\wojpr\\OneDrive\\Pulpit\\writeFile\\HelloText.txt";
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("Unable to write file");
        }
    }
}
