import java.util.InputMismatchException;

public class Matrix {
    private int[][] matrix;
    private int size;

    public Matrix(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Размер матрицы должен быть положительным целым числом");
        }
        this.size = size;
        this.matrix = new int[size][size];
    }

    public Matrix(int size, int[][] matrix) {
        if (size <= 0) {
            throw new IllegalArgumentException("Размер матрицы должен быть положительным целым числом");
        }
        this.size = size;
        this.matrix = matrix;
    }

    public Matrix add(Matrix other) {
        if (other.size != size) {
            throw new IllegalArgumentException("Matrix sizes must be equal for addition");
        }

        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return new Matrix(size, result);
    }

    public Matrix subtract(Matrix other) {
        if (other.size != size) {
            throw new IllegalArgumentException("Матрицы должны быть одной размерности");
        }

        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = this.matrix[i][j] - other.matrix[i][j];
            }
        }
        return new Matrix(size, result);
    }

    public Matrix multiply(Matrix other) {
        if (other.size != size) {
            throw new IllegalArgumentException("Матрицы должны быть одной размерности");
        }

        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int sum = 0;
                for (int k = 0; k < size; k++) {
                    sum += this.matrix[i][k] * other.matrix[k][j];
                }
                result[i][j] = sum;
            }
        }
        return new Matrix(size, result);
    }

    public double calculateFirstNorm() {
        double norm = 0;
        for (int i = 0; i < size; i++) {
            double sum = 0;
            for (int j = 0; j < size; j++) {
                sum += Math.abs(matrix[i][j]);
            }
            norm = Math.max(norm, sum);
        }
        return norm;
    }

    public double calculateSecondNorm() {
        double norm = 0;
        for (int i = 0; i < size; i++) {
            double sum = 0;
            for (int j = 0; j < size; j++) {
                sum += Math.abs(matrix[j][i]);
            }
            norm = Math.max(norm, sum);
        }
        return norm;
    }

    public static void printMatrix(Matrix matrix) {
        System.out.println("Матрица:");
        for (int i = 0; i < matrix.size; i++) {
            for (int j = 0; j < matrix.size; j++) {
                System.out.print(matrix.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            Matrix[] matrices = new Matrix[3]; // Создаем массив объектов

            // Создаем и инициализируем матрицы
            int[][] matrix1 = {{1, 2}, {3, 4}};
            matrices[0] = new Matrix(2, matrix1);

            int[][] matrix2 = {{5, 6}, {7, 8}};
            matrices[1] = new Matrix(2, matrix2);

            int[][] matrix3 = {{-1, -2}, {-3, -4}};
            matrices[2] = new Matrix(2, matrix3);

            // Находим матрицу с наименьшей первой и второй нормами
            Matrix minMatrix = matrices[0];
            for (int i = 1; i < matrices.length; i++) {
                if (matrices[i].calculateFirstNorm() < minMatrix.calculateFirstNorm() &&
                        matrices[i].calculateSecondNorm() < minMatrix.calculateSecondNorm()) {
                    minMatrix = matrices[i];
                }
            }

            System.out.println("Матрица с наименьшей первой и второй нормами:");
            printMatrix(minMatrix);
            System.out.println("Первая норма: " + minMatrix.calculateFirstNorm());
            System.out.println("Вторая норма: " + minMatrix.calculateSecondNorm());
        } catch (IllegalArgumentException e) {
            System.err.println("Возникла ошибка: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Неожиданная ошибка: " + e.getMessage());
        }
    }
}