import java.util.InputMismatchException;
import java.util.Scanner;

class Matrix {
    private int rows;
    private int cols;
    private int[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public Matrix() {
        this(2, 2);
    }

    public void fill() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    System.out.print("Введите элемент матрицы (" + i + ", " + j + "): ");
                    data[i][j] = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено некорректное значение. Попробуйте снова.");
                    input.nextLine(); // очистка буфера ввода
                    j--; // повторить ввод для этой ячейки
                }
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void swapRowsWithMinMax(int k) {
        int minElement = data[0][k];
        int maxElement = data[0][k];
        int minRow = 0;
        int maxRow = 0;
        for (int i = 1; i < rows; i++) {
            if (data[i][k] < minElement) {
                minElement = data[i][k];
                minRow = i;
            }
            if (data[i][k] > maxElement) {
                maxElement = data[i][k];
                maxRow = i;
            }
        }
        int[] temp = data[minRow];
        data[minRow] = data[maxRow];
        data[maxRow] = temp;
    }

    public void squareMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] *= data[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Введите количество строк матрицы: ");
            int rows = input.nextInt();
            System.out.print("Введите количество столбцов матрицы: ");
            int cols = input.nextInt();
            Matrix matrix = new Matrix(rows, cols);
            matrix.fill();
            System.out.println("Матрица:");
            matrix.printMatrix();
            System.out.print("Введите столбец k: ");
            int k = input.nextInt();
            matrix.swapRowsWithMinMax(k);
            System.out.println("Матрица после перемены строк:");
            matrix.printMatrix();
            matrix.squareMatrix();
            System.out.println("Матрица после возведения в квадрат:");
            matrix.printMatrix();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение для количества строк или столбцов матрицы.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: размер матрицы меньше введенного значения строк или столбцов.");
        } finally {
            input.close(); // закрытие потока ввода
        }
    }
}