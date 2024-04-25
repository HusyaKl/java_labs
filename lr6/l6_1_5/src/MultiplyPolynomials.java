import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MultiplyPolynomials {

    public static void main(String[] args) {
        List<Integer> poly1 = new ArrayList<>();
        poly1.add(3); // Коэффициент при x^2 равен 3
        poly1.add(1); // Коэффициент при x равен 1
        poly1.add(5); // Константа равна 5

        List<Integer> poly2 = new ArrayList<>();
        poly2.add(2); // Коэффициент при x^2 равен 2
        poly2.add(4); // Коэффициент при x равен 4
        poly2.add(3); // Константа равна 3

        HashMap<Integer, Integer> result = multiplyPolynomials(poly1, poly2);

        System.out.println("Result: " + result);
    }

    public static HashMap<Integer, Integer> multiplyPolynomials(List<Integer> poly1, List<Integer> poly2) {
        HashMap<Integer, Integer> result = new HashMap<>();
        int maxDegree = poly1.size() + poly2.size() - 2;

        for (int i = 0; i < poly1.size(); i++) {
            for (int j = 0; j < poly2.size(); j++) {
                int coef = poly1.get(i) * poly2.get(j);
                int degree = i + j;
                result.put(maxDegree - degree, result.getOrDefault(maxDegree - degree, 0) + coef);
            }
        }

        return result;
    }
}