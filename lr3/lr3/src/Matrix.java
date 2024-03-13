public class Matrix {
    private int[][] matrix;
    private int size;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];
    }

    public Matrix(int size, int[][] matrix) {
        this.size = size;
        this.matrix = matrix;
    }

    public Matrix add(Matrix other) {
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return new Matrix(size, result);
    }

    public Matrix subtract(Matrix other) {
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = this.matrix[i][j] - other.matrix[i][j];
            }
        }
        return new Matrix(size, result);
    }

    public Matrix multiply(Matrix other) {
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
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.size; i++) {
            for (int j = 0; j < matrix.size; j++) {
                System.out.print(matrix.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
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
        System.out.println("First norm: " + minMatrix.calculateFirstNorm());
        System.out.println("Second norm: " + minMatrix.calculateSecondNorm());
    }
}