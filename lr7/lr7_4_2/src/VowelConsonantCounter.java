import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String text = "Это предложение номер один. Это предложение номер два.";
        Pattern pattern = Pattern.compile("\\p{Punct}");
        String[] sentences = text.split(pattern.pattern()); // Разделение текста на предложения

        // Проходим по каждому предложению и подсчитываем количество гласных и согласных букв
        for (String sentence : sentences) {
            int vowelsCount = 0;
            int consonantsCount = 0;

            // Приводим предложение к нижнему регистру для удобства подсчета
            String lowerCaseSentence = sentence.toLowerCase();

            // Подсчет гласных и согласных букв
            for (char c : lowerCaseSentence.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' || c == 'а' || c == 'о' || c == 'и' || c == 'е' || c == 'ё' || c == 'э' || c == 'ы' || c == 'у' || c == 'ю' || c == 'я') {
                    vowelsCount++;
                } else if (c >= 'a' && c <= 'z' || c >= 'а' && c <= 'я') {
                    consonantsCount++;
                }
            }

            System.out.println("Предложение: " + sentence);
            System.out.println("Количество гласных: " + vowelsCount);
            System.out.println("Количество согласных: " + consonantsCount);
        }
    }
}