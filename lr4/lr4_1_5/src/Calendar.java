import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calendar {
    private Map<String, String> holidays;

    public Calendar() {
        this.holidays = new HashMap<>();
    }

    public void addHoliday(String date, String name) {
        holidays.put(date, name);
    }

    public void displayHolidays() {
        System.out.println("Выходные в календаре:");
        for (Map.Entry<String, String> entry : holidays.entrySet()) {
            System.out.println("Дата: " + entry.getKey() + " | Название: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.addHoliday("2025-01-01", "НОвый год");
        calendar.addHoliday("2024-12-27", "Мой день рождения");
        calendar.addHoliday("2024-06-01", "День засчиты детей");

        calendar.displayHolidays();
    }
}