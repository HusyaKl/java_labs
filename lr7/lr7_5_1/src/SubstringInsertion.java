public class SubstringInsertion {
    public static void main(String[] args) {
        String text ="Это предложение для вставки";
        int k = 16; // Позиция, после которой нужно вставить подстроку
        String substringToInsert = "вставка "; // Заданная подстрока для вставки

        // Проверка, что k находится в пределах длины текста
        if (k < 0 || k > text.length()) {
            System.out.println("Ошибка: позиция вставки находится вне диапазона текста.");
            return;
        }

        String newText = text.substring(0, k) + substringToInsert + text.substring(k);

        System.out.println("Исходный текст: " + text);
        System.out.println("Текст после вставки подстроки: " + newText);
    }
}
