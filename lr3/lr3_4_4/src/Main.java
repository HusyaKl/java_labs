import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите проходной балл на факультет: ");
        int passingScore = scanner.nextInt();
        scanner.nextLine();

        Faculty faculty = new Faculty(passingScore);

        System.out.print("Введите количество абитуриентов: ");
        int numApplicants = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numApplicants; i++) {
            System.out.print("Введите ФИО абитуриента: ");
            String name = scanner.nextLine();
            Abiturient abiturient = new Abiturient(name);

            System.out.print("Введите количество экзаменов: ");
            int numScores = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < numScores; j++) {
                System.out.print("Введите баллы за экзамен: ");
                int score = scanner.nextInt();
                scanner.nextLine();
                abiturient.addExamScore(score);
            }

            faculty.addApplicant(abiturient);
        }

        System.out.println("Результаты поступления:");
        faculty.enrollStudents();

    }
}