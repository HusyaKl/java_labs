public class ReplaceAdjacentChars {

    public static void main(String[] args) {
        String text = "Мееееня зовут нааастя и я дееелаю лабораторные работы по джаве";

        String result = replaceAdjacentChars(text);

        System.out.println("Текст после замены: " + result);
    }

    public static String replaceAdjacentChars(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder result = new StringBuilder();
        result.append(text.charAt(0)); // Добавляем первый символ в результат

        for (int i = 1; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            char previousChar = text.charAt(i - 1);

            if (currentChar != previousChar) {
                result.append(currentChar); // Добавляем символ к результату
            }
        }

        return result.toString();
    }
}