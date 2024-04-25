import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> c1 = new ArrayList<>();
        List<Integer> c2 = new ArrayList<>();

        readFromFile("input.txt", c1, c2);

        Collections.sort(c1);
        Collections.sort(c2);

        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(c1);
        mergedList.addAll(c2);

        Collections.sort(mergedList);

        System.out.println(mergedList);
    }

    public static void readFromFile(String filename, List<Integer> c1, List<Integer> c2) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            boolean isSecondSet = false;

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();

                if (num < 0) {
                    isSecondSet = true;
                    continue;
                }

                if (isSecondSet) {
                    c2.add(num);
                } else {
                    c1.add(num);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: ");
            e.printStackTrace();
        }
    }
}