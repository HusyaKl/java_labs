import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество слов");
        int count = sc.nextInt();

        sc.nextLine();

        System.out.println("Введите слова:");
        int word_with_balance = 0;
        int latin_word = 0;

        for (int i = 0; i < count; i++) {
            String word = sc.nextLine();

            int count_eng_letters = 0;
            int balance = 0;

            for (Character letter : word.toCharArray()) {
                if (((letter >= 'A') && (letter <= 'Z')) || ((letter >= 'a') && (letter <= 'z'))) {
                    count_eng_letters++;
                    if ((letter == 'A') || (letter == 'E') || (letter == 'I') || (letter == 'O') || (letter == 'U') || (letter == 'Y')
                            || (letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u') || (letter == 'y'))
                        ++balance;
                    else
                        --balance;
                }
            }
            if (count_eng_letters == word.length()) {
                ++latin_word;
                System.out.println("Слово, содержащее только буквы латинского алфавита: " + word);
                if (balance == 0) {
                    ++word_with_balance;
                    System.out.println("Слово с одинаковым количеством гласных и согласных: " + word);
                }
            }
        }
        System.out.println("Количество слов с буквами только латинского алфавита: " + latin_word);
        System.out.println("Количество слов с одинаковым количеством гласных и согласных: " + word_with_balance);

        System.out.println("Клушина Анастасия Алексеевна");
        System.out.println("Задание получено 09.02.2024 14:30");
        Date date = new Date();
        System.out.println("Дата и время сдачи " + date.toString());

    }
}



