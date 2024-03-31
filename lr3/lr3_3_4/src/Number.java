import java.util.Objects;
public class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Number otherNumber = (Number) obj;
        return value == otherNumber.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public Number addition(Number otherNumber) {
        int sum = this.value + otherNumber.value;
        return new Number(sum);
    }

    public Number subtraction(Number otherNumber) {
        int difference = this.value - otherNumber.value;
        return new Number(difference);
    }

    public Number multiplication(Number otherNumber) {
        int product = this.value * otherNumber.value;
        return new Number(product);
    }

    public Number division(Number otherNumber) {
        if (otherNumber.value == 0) {
            throw new ArithmeticException("Division by zero");
        }
        int quotient = this.value / otherNumber.value;
        return new Number(quotient);
    }
}