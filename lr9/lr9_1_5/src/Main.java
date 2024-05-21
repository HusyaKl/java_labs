//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Настя", "Настя", "Бауманка", "улица", "Бауманка", "гараж", "солнце");

        List<String> distinctStrings = strings.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Строки без повторов: " + distinctStrings);
    }
}