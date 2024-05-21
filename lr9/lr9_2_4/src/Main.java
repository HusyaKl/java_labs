//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("нк", "ак", "дт", "кч", "ит");

        Map<Character, Character> resultMap = strings.stream()
                .collect(Collectors.toMap(s -> s.charAt(0), s -> s.charAt(1)));

        System.out.println("Результат преобразования в MAP: " + resultMap);
    }
}