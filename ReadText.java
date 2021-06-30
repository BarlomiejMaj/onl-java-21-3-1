package writeFile;

import java.io.*;

public class ReadText {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\wojpr\\OneDrive\\Pulpit\\writeFile\\HelloText.txt";
        File file = new File(fileName);
        try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
    }
}
