// Интерфейс "Mobile"
interface Mobile {
    void call(); // метод для совершения звонка
}

// Абстрактный класс "SiemensMobile" реализует интерфейс "Mobile"
abstract class SiemensMobile implements Mobile {
    protected String model;

    public SiemensMobile(String model) {
        this.model = model;
    }

    abstract void displayInfo(); // метод для отображения информации о модели

    @Override
    public void call() {
        System.out.println("Звонок с мобильного телефона Siemens.");
    }
}

// Класс "Model" наследует абстрактный класс "SiemensMobile"
class Model extends SiemensMobile {
    public Model(String model) {
        super(model);
    }

    @Override
    void displayInfo() {
        System.out.println("Модель мобильного телефона Siemens: " + model);
    }

    public static void main(String[] args) {
        Model phone = new Model("S45");
        phone.displayInfo();
        phone.call();
    }

}