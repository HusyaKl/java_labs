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

            String text = reader.readLine();

            int maxDigits = 0;
            int curDigits = 0;

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);

                if (Character.isDigit(c)) {
                    curDigits++;
                } else {
                    if (curDigits > maxDigits) {
                        maxDigits = curDigits;
                    }
                    curDigits = 0;
                }
            }

            if (curDigits > maxDigits) {
                maxDigits = curDigits;
            }

            writer.write("Наибольшее число цифр, идущих подряд: " + maxDigits);

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файла");
        }
    }
}