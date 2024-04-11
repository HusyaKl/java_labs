import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            String text;
            while ((text = reader.readLine()) != null) {

                String[] words = text.split("\\s+");

                for (int i = 0; i < words.length - 1; i++) {
                    String currentWord = words[i];
                    String nextWord = words[i + 1];
                    System.out.println(currentWord);
                    System.out.println(nextWord);

                    if (currentWord.charAt(currentWord.length() - 1) == nextWord.charAt(0)) {
                        writer.write(currentWord + " " + nextWord +  System.lineSeparator());
                    }
                }
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}