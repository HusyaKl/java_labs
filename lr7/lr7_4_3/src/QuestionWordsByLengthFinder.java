import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionWordsByLengthFinder {public static void main(String[] args) {
    String text = "Это вопросительное предложение? Можно ли найти слова заданной длины в нем? Во всех вопросительных предложениях, а не в других?";

    int len = 3; // Искомая длина слова

    Pattern pattern = Pattern.compile("([^.!?]+[.!?])");
    Matcher matcher = pattern.matcher(text);

    Set<String> uniqueWords = new HashSet<>();

    while (matcher.find()) {
        String part = text.substring(matcher.start(), matcher.end());
        if (part.endsWith("?")) {
            for (String word: part.split(" ")) {
                String tempStr = word.replaceAll("[.,?!:;]+$", "");
                if ((tempStr.length() == len) && !(uniqueWords.contains(tempStr))){
                    uniqueWords.add(tempStr);
                }
            }
        }
    }

    System.out.println("Уникальные слова длины " + len + " во всех вопросительных предложениях:");
    for (String uniqueWord : uniqueWords) {
        System.out.println(uniqueWord);
    }
}
}
