import java.util.ArrayList;
import java.util.List;

    class Abiturient {
        private String name;
        private List<Integer> examScores;

        public Abiturient(String name) {
            this.name = name;
            this.examScores = new ArrayList<>();
        }

        public void addExamScore(int score) {
            examScores.add(score);
        }

        public int calculateAverageScore() {
            int sum = 0;
            for (int score : examScores) {
                sum += score;
            }
            return examScores.size() > 0 ? sum / examScores.size() : 0;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Абитурьент{" +
                    "имя: " + name + '\'' +
                    ", , баллы за экзамены: " + examScores +
                    '}';
        }
    }