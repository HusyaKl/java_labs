import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива");


        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];

        System.out.println("Введите элементы массива");

        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int out = arr_size - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(arr[in] > arr[in + 1]) {
                    int dummy = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = dummy;
                }
            }
        }

        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}