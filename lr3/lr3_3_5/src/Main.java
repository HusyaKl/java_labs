public class Main {
    public static void main(String[] args) {
        Window window1 = new Window(false);
        Window window2 = new Window(true);

        Door door1 = new Door(false);
        Door door2 = new Door(true);

        Window[] windows = {window1, window2};
        Door[] doors = {door1, door2};

        House house = new House(windows, doors);
        house.printWindowsAndDoorsCount();

        house.lockOnKey();
        house.closeWindow(0);
        house.unlockDoor(1);

        house.printWindowsAndDoorsCount();
    }
}