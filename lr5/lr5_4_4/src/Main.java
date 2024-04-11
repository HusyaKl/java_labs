import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Создаем новую директорию
            File directory = new File("results");
            directory.mkdir();

            // Создаем файл с фамилиями студентов и оценками
            File studentsFile = new File(directory, "students.txt");
            studentsFile.createNewFile();

            // Записываем в файл данные студентов
            BufferedWriter writer = new BufferedWriter(new FileWriter(studentsFile));
            writer.write("Клушина 7.5\n");
            writer.write("Тюкин 8.0\n");
            writer.write("Чернавина 6.9\n");
            writer.write("Платонов 9.5\n");
            writer.close();

            // Создаем файл для записи результатов
            File output = new File(directory, "output.txt");
            output.createNewFile();


            // Чтение данных из файла
            BufferedReader reader = new BufferedReader(new FileReader(studentsFile));
            BufferedWriter resultWriter = new BufferedWriter(new FileWriter(output));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\s+");

                if (data.length > 1) {
                    if (data[1].contains(".")) {
                        double score = Double.parseDouble(data[1]);
                        if (score > 7) {
                            resultWriter.write(data[0].toUpperCase() + "\n");
                        }
                    }
                }
            }

            reader.close();
            resultWriter.close();

            System.out.println("Результаты записаны в файл " + output.getPath());
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами");
        }
    }
}