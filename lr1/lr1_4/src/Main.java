import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final static String PASSWORD = "Nastya iu623";
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        if(args.length == 0) {
            System.out.println("Введите пароль");
        }
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals(PASSWORD)) {
            System.out.println("Пароль верный");
        }
        else {
            System.out.println("Пароль неверный");
        }
    }
}