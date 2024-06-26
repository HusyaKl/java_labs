//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("настя", "нож", "улица", "улитка", "селезень", "слизняк");

        Map<Character, List<String>> groupedByFirstChar = strings.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println("Результат преобразования в MAP с группировкой по первому символу: " + groupedByFirstChar);
    }
}