public class VowelWordsCounter {
    public static void main(String[] args) {
        String poem = "Мороз и солнце, день чудесный, еще ты дремлешь, друг прелесный";

        // Разделение стихотворения на отдельные слова
        String[] words = poem.split("\\s+"); // Разделение по пробелам

        int vowelWordsCount = 0;

        // Перебор каждого слова из стихотворения
        for (String word : words) {
            char firstChar = Character.toLowerCase(word.charAt(0));
            char lastChar = Character.toLowerCase(word.charAt(word.length() - 1));

            // Проверка, начинается ли и заканчивается ли слово гласной буквой
            // Гласные буквы: a, e, i, o, u, y, а, о, и, е, ё, э, ы, у, ю, я
            if (isVowel(firstChar) && isVowel(lastChar)) {
                vowelWordsCount++;
            }
        }

        System.out.println("Количество слов, начинающихся и заканчивающихся гласной буквой: " + vowelWordsCount);
    }

    // Метод для проверки, является ли символ гласной буквой
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' || c == 'а' || c == 'о' || c == 'и' || c == 'е' || c == 'ё' || c == 'э' || c == 'ы' || c == 'у' || c == 'ю' || c == 'я';
    }
}