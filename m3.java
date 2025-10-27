class m3 {
}

class EvenOdd {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isOdd(int n) {
        boolean even = isEven(n);
        return !even;
    }
}

class MathUtil {

    static double floor(double d) {
        return (int) d;
    }

    static double decimalPart(double d) {
        if (d >= 0) {
            // ex.: 4.4 -> 0.4 ou 13.0 -> 0.0
            return d - floor(d);
        } else {
            // ceil(d) = -floor(-d)
            double ceil = -floor(-d);
            // ex.: -1.5 -> -0.5 ou -0.5 -> -0.5
            return d - ceil;
        }
    }
}
