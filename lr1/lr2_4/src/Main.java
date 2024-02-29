import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите длину массива");


        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();

        int[] arr = new int[arr_size];

        System.out.println("Введите элементы массива");

        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Следующие числа делятся на 5 и 7:");

        for (int i = 0; i < arr_size; i++) {
            if ((arr[i] % 5 == 0) && (arr[i] % 7 == 0)) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
