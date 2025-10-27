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
