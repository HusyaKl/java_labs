public class ExcludeMaxSubstring {

    public static void main(String[] args) {
        String text = "Меня зовут Настя и я делаю лабораторные работы по джаве.";
        char startChar = 'л'; // Заданный символ начала подстроки
        char endChar = 'е';   // Заданный символ конца подстроки

        String longestSubstring = findLongestSubstring(text, startChar, endChar);

        if (longestSubstring.isEmpty()) {
            System.out.println("Подстрока не найдена.");
        } else {
            System.out.println("Максимальная подстрока: " + longestSubstring);

            String result = text.replace(longestSubstring, ""); // Исключаем максимальную подстроку
            System.out.println("Текст с исключенной подстрокой: " + result);
        }
    }

    public static String findLongestSubstring(String text, char startChar, char endChar) {
        String longestSubstring = "";
        int maxLength = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == startChar) {
                int endIndex = text.indexOf(endChar, i + 1);
                if (endIndex != -1) {
                    String substring = text.substring(i, endIndex + 1);
                    int length = endIndex - i + 1;

                    if (length > maxLength) {
                        maxLength = length;
                        longestSubstring = substring;
                    }
                }
            }
        }

        return longestSubstring;
    }
}