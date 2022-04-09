import java.util.Objects;

public class Fraction implements Cloneable {
    //14.1
    private int top;
    private int bottom;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("Fractions with denominators of 0 are not defined");
        top = numerator;
        bottom = denominator;
    }

    //14.2, 14.3, 14.4
    public String getDisplayString() {
        return toString();
    }

    @Override
    public String toString() {
        if (top == 0) return "0";
        if (bottom == 1) return Integer.toString(top);

        fix();
        return top + "/" + this.bottom;
    }

    private void fix() {
        if (bottom < 0) {
            bottom *= -1;
            top *= -1;
        }
        this.reduction();
    }

    private void reduction() {
        int gcd = gcd(Math.abs(top), bottom);
        top /= gcd;
        bottom /= gcd;
    }

    private static int gcd(int a, int b) {
        int i = Math.min(a, b);
        while (i > 0) {
            if (a % i == 0 && b % i == 0) break;
            i--;
        }
        return i;
    }

    //14.5
    public Fraction add(Fraction other) {
        Fraction clone = null, other_clone;
        try {
            clone = clone();
            other_clone = other.clone();
            Fraction.reduceDenominator(clone, other_clone);
            clone.setNumerator(clone.top + other_clone.top);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public static void reduceDenominator(Fraction a, Fraction b) {
        int d_a = a.getDenominator(), d_b = b.getDenominator();
        int lcm = lcm(d_a, d_b);
        a.setNumerator(a.top * lcm / d_a);
        a.setDenominator(lcm);
        b.setNumerator(b.top * lcm / d_b);
        b.setDenominator(lcm);
    }

    public static int lcm(int a, int b) {
        int i = Math.max(a, b);
        while (i < Integer.MAX_VALUE) {
            if (i % a == 0 && i % b == 0) break;
            i++;
        }
        return i;
    }

    public int getNumerator() {
        fix();
        return top;
    }

    public void setNumerator(int numerator) {
        top = numerator;
    }

    public int getDenominator() {
        fix();
        return bottom;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("Fractions with denominators of 0 are not defined");
        bottom = denominator;
    }

    @Override
    public Fraction clone() throws CloneNotSupportedException {
        return (Fraction) super.clone();
    }

    //14.6
    public Fraction remove(Fraction other) {
        Fraction other_clone = null;
        try {
            other_clone = other.clone();
            other_clone.setNumerator(other.top * -1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return add(Objects.requireNonNull(other_clone));
    }

    public Fraction multiply(Fraction other) {
        Fraction clone = null, other_clone;
        try {
            clone = clone();
            other_clone = other.clone();
            clone.setNumerator(clone.top * other_clone.top);
            clone.setDenominator(clone.bottom * other.bottom);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public Fraction divide(Fraction other) {
        Fraction other_clone = null;
        try {
            other_clone = other.clone();
            int temp = other_clone.top;
            other_clone.setNumerator(other.bottom);
            other_clone.setDenominator(temp);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return multiply(Objects.requireNonNull(other_clone));
    }
}
