import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwapFirstAndLastWords {
    public static void main(String[] args) {
        String text = "Меня зовут Настя. Я учусь в МГТУ им Баумана. Делаю лабораторные по Java.";

        Pattern pattern = Pattern.compile("([^.!?]+[.!?])");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String part = text.substring(matcher.start(), matcher.end()).trim();
            String[] words = part.split(" ");
            String first_word = words[0].replaceAll("[.,?!:;]+$", "");
            String last_word = words[words.length - 1].replaceAll("[.,?!:;]+$", "");
            words[0] = words[0].replaceAll(first_word, last_word);
            words[words.length - 1] = words[words.length - 1].replace(last_word, first_word);
            System.out.println(String.join(" ", words));
        }
    }
}