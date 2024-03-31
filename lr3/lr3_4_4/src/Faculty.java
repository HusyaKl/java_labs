import java.util.ArrayList;
import java.util.List;
class Faculty {
    private List<Abiturient> abiturients;
    private int passingScore;

    public Faculty(int passingScore) {
        this.abiturients = new ArrayList<>();
        this.passingScore = passingScore;
    }

    public void addApplicant(Abiturient abiturient) {
        abiturients.add(abiturient);
    }

    public void enrollStudents() {
        for (Abiturient abiturient : abiturients) {
            if (abiturient.calculateAverageScore() >= passingScore) {
                System.out.println("Абитуриент " + abiturient.getName() + " принят на факультет.");
            } else {
                System.out.println("Абитуриент " + abiturient.getName() + " не приянт на факультет.");
            }
        }
    }
}