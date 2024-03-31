import java.util.Objects;
public class SimpleFraction {
    private int numerator;
    private int denominator;

    public SimpleFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleFraction otherFraction = (SimpleFraction) obj;
        return numerator == otherFraction.numerator &&
                denominator == otherFraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public SimpleFraction addition(SimpleFraction otherFraction) {
        int newNumerator = this.numerator * otherFraction.denominator + otherFraction.numerator * this.denominator;
        int newDenominator = this.denominator * otherFraction.denominator;
        return new SimpleFraction(newNumerator, newDenominator);
    }

    public SimpleFraction subtraction(SimpleFraction otherFraction) {
        int newNumerator = this.numerator * otherFraction.denominator - otherFraction.numerator * this.denominator;
        int newDenominator = this.denominator * otherFraction.denominator;
        return new SimpleFraction(newNumerator, newDenominator);
    }

    public SimpleFraction multiplication(SimpleFraction otherFraction) {
        int newNumerator = this.numerator * otherFraction.numerator;
        int newDenominator = this.denominator * otherFraction.denominator;
        return new SimpleFraction(newNumerator, newDenominator);
    }

    public SimpleFraction division(SimpleFraction otherFraction) {
        int newNumerator = this.numerator * otherFraction.denominator;
        int newDenominator = this.denominator * otherFraction.numerator;
        return new SimpleFraction(newNumerator, newDenominator);
    }
}