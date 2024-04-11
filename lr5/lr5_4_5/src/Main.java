import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание новой директории
        File directory = new File("results");
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Директория создана: results");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип данных (char, String, int, double):");
        String dataType = scanner.nextLine();

        try {
            File inputFile = new File("input.txt");
            File outputFile = new File("results/output.txt");
            Scanner fileScanner = new Scanner(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            while (fileScanner.hasNext()) {
                if (dataType.equals("char")) {
                    String data = fileScanner.next();
                    if (data.length() == 1) {
                        writer.write(data + " ");
                    }
                } else if (dataType.equals("String")) {
                    String data = fileScanner.next();
                    writer.write(data + " ");
                } else if (dataType.equals("int")) {
                    if (fileScanner.hasNextInt()) {
                        int data = fileScanner.nextInt();
                        writer.write(data + " ");
                    } else {
                        fileScanner.next();
                    }
                } else if (dataType.equals("double")) {
                    if (fileScanner.hasNextDouble()) {
                        double data = fileScanner.nextDouble();
                        writer.write(data + " ");
                    } else {
                        fileScanner.next();
                    }
                }
            }

            fileScanner.close();
            writer.close();
            System.out.println("Результаты сохранены в файле results/output.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}