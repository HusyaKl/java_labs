import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ввод первой дроби
        System.out.println("Введите первую дробь (числитель и знаменатель):");
        int numerator1 = scanner.nextInt();
        int denominator1 = scanner.nextInt();
        SimpleFraction fraction1 = new SimpleFraction(numerator1, denominator1);

        // Ввод второй дроби
        System.out.println("Введите вторую дробь (числитель и знаменатель):");
        int numerator2 = scanner.nextInt();
        int denominator2 = scanner.nextInt();
        SimpleFraction fraction2 = new SimpleFraction(numerator2, denominator2);

        SimpleFraction sum = fraction1.addition(fraction2);
        System.out.println("Сумма простых дробей: " + sum);

        SimpleFraction difference = fraction1.subtraction(fraction2);
        System.out.println("Разность простых дробей: " + difference);

        SimpleFraction product = fraction1.multiplication(fraction2);
        System.out.println("Произведение: " + product);

        SimpleFraction quotient = fraction1.division(fraction2);
        System.out.println("Частное: " + quotient);

        // Ввод первого числа
        System.out.println("Введите первое число:");
        int number1Value = scanner.nextInt();
        Number number1 = new Number(number1Value);

        // Ввод второго числа
        System.out.println("Введите второе число:");
        int number2Value = scanner.nextInt();
        Number number2 = new Number(number2Value);

        Number sumNum = number1.addition(number2);
        System.out.println("Сумма: " + sumNum);

        Number differenceNum = number1.subtraction(number2);
        System.out.println("Разность: " + differenceNum);

        Number productNum = number1.multiplication(number2);
        System.out.println("Произведение: " + productNum);

        Number quotientNum = number1.division(number2);
        System.out.println("Частное: " + quotientNum);
    }
}