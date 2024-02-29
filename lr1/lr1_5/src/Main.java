import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        if(args.length == 0) {
            System.out.println("Введите количество чисел");
        }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Введите числа по одному");
        int s = 0;
        int p = 1;
        for (int i = 0; i < n; i++) {
            int chislo = scanner.nextInt();
            s += chislo;
            p *= chislo;
        }
        System.out.println(s);
        System.out.println(p);
    }
}
