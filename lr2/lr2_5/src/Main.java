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

        System.out.println("Изначальная матрица: ");

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                arr[i][j]=r.nextInt(2*size+1) - size;
                System.out.print(arr[i][j]+"\t");
            }

            System.out.print("\n");
        }

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("Транспонированная матрица: ");

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }

            System.out.print("\n");
        }
    }
}