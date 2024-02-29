import java.util.Scanner;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество слов");
        int count = sc.nextInt();

        sc.nextLine();

        String min_word = null;
        int min_count = -1;

        System.out.println("Введите слова");

        for (int i = 0; i < count; i++) {
            String word = sc.nextLine();
            int chars_count = (int) word.chars().distinct().count();

            if (min_count < 0 || chars_count < min_count) {
                min_count = chars_count;
                min_word = word;
            }
        }

        System.out.println("Слово, в котором число различных символов минимально: " + min_word);
        System.out.println("Количество различных символов: " + min_count);

        System.out.println("Клушина Анастасия Алексеевна");
        System.out.println("Задание получено 09.02.2024 14:30");
        Date date = new Date();
        System.out.println("Дата и время сдачи " + date.toString());

        sc.close();
    }
}