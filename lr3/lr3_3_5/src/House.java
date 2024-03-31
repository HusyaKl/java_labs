class House {
    private Window[] windows;
    private Door[] doors;

    public House(Window[] windows, Door[] doors) {
        this.windows = windows;
        this.doors = doors;
    }

    public void lockOnKey() {
        for (Door door : doors) {
            door.lock();
        }
    }

    public void printWindowsAndDoorsCount() {
        System.out.println("Количество окон: " + windows.length);
        System.out.println("Количество дверей: " + doors.length);
    }

    public void openWindow(int index) {
        if (index >= 0 && index < windows.length) {
            windows[index].open();
            System.out.println("Окно номер " + index + " открыто.");
        } else {
            System.out.println("Столько окон нет(");
        }
    }

    public void closeWindow(int index) {
        if (index >= 0 && index < windows.length) {
            windows[index].close();
            System.out.println("Окно номер " + index + " закрыто.");
        } else {
            System.out.println("Столько окон нет(");
        }
    }

    public void unlockDoor(int index) {
        if (index >= 0 && index < doors.length) {
            doors[index].unlock();
            System.out.println("Дверь номер " + index + " открыта.");
        } else {
            System.out.println("Столько дверей нет(");
        }
    }

    public void lockDoor(int index) {
        if (index >= 0 && index < doors.length) {
            doors[index].lock();
            System.out.println("Дверь номер " + index + " закрыта.");
        } else {
            System.out.println("Столько дверей нет(");
        }
    }
}