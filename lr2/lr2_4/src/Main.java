import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размерность матрицы");
        int size = sc.nextInt();

        sc.nextLine();

        int[][] arr = new int[size][size];
        Random r = new Random();

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                arr[i][j]=r.nextInt(2*size+1) - size;
                System.out.print(arr[i][j]+"\t");
            }

            System.out.print("\n");
        }

        for(int i = 0; i < size; i++)
        {
            int sum = 0;
            boolean key = false;

            for(int j = 0; j < size; j++)
            {
                if (arr[i][j] > 0) {
                    if (key) {
                        System.out.println("Сумма между первым и вторым положительными элементами " + i + " строки равна " + sum);
                        break;
                    }

                    key = true;
                    continue;
                }

                if (key) {
                    sum += arr[i][j];
                }
            }
        }
    }
}