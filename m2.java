class m2 {

    static void varAssignDiv() {
        int v = 2024;
        v = v / 10;
        v = v / 10;
        v = v / 10;
    }

    int firstDigit(int n) {
        int x = 10;
        while (n > x) {
            n = n / 10;
        }
        return n;
    }
}
