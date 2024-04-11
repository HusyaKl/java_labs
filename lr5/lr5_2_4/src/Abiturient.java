import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Abiturient {
    private int id;
    private String surname;
    private String firstName;
    private String middleName;
    private String address;
    private String phoneNumber;
    private int[] grades;

    public Abiturient(int id, String surname, String firstName, String middleName, String address, String phoneNumber, int[] grades) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return surname + " " + firstName + " " + middleName;
    }

    public int[] getGrades() {
        return grades;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Abiturient> abiturients = new ArrayList<>();
        abiturients.add(new Abiturient(1, "Чернавина", "Ксения", "Максимовна", "Ярославль", "123456789", new int[]{80, 70, 60}));
        abiturients.add(new Abiturient(2, "Клушина", "Анастасия", "Алексеевна", "Москва", "987654321", new int[]{90, 85, 75}));
        abiturients.add(new Abiturient(3, "Тюкин", "Иван", "Дмитриевич", "Владивосток", "555555555", new int[]{50, 55, 70}));

        try {
            // a) список абитуриентов, имеющих неудовлетворительные оценки
            System.out.println("Список абитуриентов, имеющих неудовлетворительные оценки:");
            for (Abiturient abiturient : abiturients) {
                for (int grade : abiturient.getGrades()) {
                    if (grade < 60) {
                        System.out.println(abiturient.getFullName());
                        break;
                    }
                }
            }

            // b) список абитуриентов, средний балл у которых выше заданного
            System.out.print("Введите балл: ");
            double minAverageGrade = input.nextDouble();
            System.out.println("Список абитуриентов, средний балл у которых выше " + minAverageGrade + ":");
            for (Abiturient abiturient : abiturients) {
                if (abiturient.calculateAverageGrade() > minAverageGrade) {
                    System.out.println(abiturient.getFullName());
                }
            }

            // c) выбрать заданное число n абитуриентов, имеющих самый высокий средний балл
            System.out.print("Введите количество абитурьентов: ");
            int n = input.nextInt();
            abiturients.sort((a, b) -> Double.compare(b.calculateAverageGrade(), a.calculateAverageGrade()));
            System.out.println("Топ " + n + " абитурьентов с максимальным средним баллом:");
            for (int i = 0; i < n && i < abiturients.size(); i++) {
                System.out.println(abiturients.get(i).getFullName());
            }

            // полный список абитуриентов с полупроходным баллом
            double passingGrade = 60.0;
            System.out.println("Список абитуриентов с полупроходным баллом:");
            for (int i = n; i < abiturients.size(); i++) {
                if (abiturients.get(i).calculateAverageGrade() >= passingGrade) {
                    System.out.println(abiturients.get(i).getFullName());
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение.");
        } finally {
            input.close(); // закрытие потока ввода
        }
    }
}