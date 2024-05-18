import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordReplacement {

    public static void main(String[] args) {
        String text = "Это моя седьмая лабораторная по python";
        int n = 6;  // Длина слов, которые нужно заменить
        String replacement = "Java";  // Подстрока, на которую нужно заменить
        String regex = "\\b\\w{" + n + "}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String replacedText = matcher.replaceAll(replacement);

        System.out.println("Исходный текст: " + text);
        System.out.println("Замененный текст: " + replacedText);
    }
}