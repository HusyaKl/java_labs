// Интерфейс "Здание"
interface Building {
    void open(); // открыть здание
    void close(); // закрыть здание
}

// Абстрактный класс "Общественное Здание" реализует интерфейс "Здание"
abstract class PublicBuilding implements Building {
    String buildingName;

    public PublicBuilding(String buildingName) {
        this.buildingName = buildingName;
    }

    public abstract void operate();

    @Override
    public void open() {
        System.out.println(buildingName + " открыт.");
    }

    @Override
    public void close() {
        System.out.println(buildingName + " закрыт.");
    }
}

// Класс "Театр" наследует абстрактный класс "Общественное Здание"
class Theater extends PublicBuilding {
    public Theater(String buildingName) {
        super(buildingName);
    }

    @Override
    public void operate() {
        System.out.println(buildingName + " показывает представление.");
    }

    public static void main(String[] args) {
        Theater theater = new Theater("БОльшой театр");
        theater.open();
        theater.operate();
        theater.close();
    }
}