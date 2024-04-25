import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> objects = readObjectsFromFile("input.txt");
        List<ObjectInfo> c1 = buildC1(objects);
        List<ObjectInfo> compressedC1 = compressC1(c1);

        for (ObjectInfo obj : compressedC1) {
            System.out.println(obj.getName() + " - " + obj.getCode());
        }
    }

    public static List<String> readObjectsFromFile(String filename) {
        List<String> objects = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                objects.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка.");
            e.printStackTrace();
        }
        return objects;
    }

    public static List<ObjectInfo> buildC1(List<String> objects) {
        List<ObjectInfo> c1 = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            c1.add(new ObjectInfo(objects.get(i), i));
        }
        c1.sort(Comparator.comparingInt(ObjectInfo::getCode));
        return c1;
    }

    public static List<ObjectInfo> compressC1(List<ObjectInfo> c1) {
        List<ObjectInfo> compressedC1 = new ArrayList<>();
        Set<String> objectNamesSet = new HashSet<>();

        for (ObjectInfo obj : c1) {
            if (objectNamesSet.add(obj.getName())) {
                compressedC1.add(obj);
            }
        }
        return compressedC1;
    }
}

class ObjectInfo {
    private String name;
    private int code;

    public ObjectInfo(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}