import java.util.HashMap;
import java.util.Scanner;

public class AddPolynomials {
    public static void main(String[] args) {
        HashMap<Integer, Integer> poly1 = new HashMap<>();
        HashMap<Integer, Integer> poly2 = new HashMap<>();

        inputPolynomial(poly1, "1");
        inputPolynomial(poly2, "2");

        HashMap<Integer, Integer> result = addPolynomials(poly1, poly2);

        System.out.println("Результат: " + result);
    }

    public static void inputPolynomial(HashMap<Integer, Integer> poly, String polyNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите полином " + polyNumber + ":");
        System.out.print("Введите степень х или -1 для завершения: ");
        while (true) {
            int degree = scanner.nextInt();
            if (degree == -1) {
                break;
            }
            System.out.print("Введите коэффициент при x^" + degree + ": ");
            int coefficient = scanner.nextInt();
            poly.put(degree, coefficient);
        }
    }

    public static HashMap<Integer, Integer> addPolynomials(HashMap<Integer, Integer> poly1, HashMap<Integer, Integer> poly2) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (Integer key : poly1.keySet()) {
            result.put(key, poly1.get(key) + poly2.getOrDefault(key, 0));
        }

        for (Integer key : poly2.keySet()) {
            if (!result.containsKey(key)) {
                result.put(key, poly2.get(key));
            }
        }

        return result;
    }
}