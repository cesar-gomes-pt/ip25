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

    int lastDigit(int n) {
        int x = 10;
        while (n > x) {
            // Em programação (e em matemática de inteiros), o resto da divisão inteira por 10 é obtido com o operador módulo (%):
            n = n % 10;
        }
        return n;
    }

    static void naturalsIterator() {
        int i = 1;
        while (i < 5) {
            i = i + 1;
        }
    }

    int sumNaturals(int max) {
        int s = 0;
        int n = 1;
        while (n <= max) {
            s = s + n;
            n++;
        }
        return s;
    }

    int intervalLength(int min, int max) {
        int intervalo = max - min + 1;
        assert min >= 0 && max >= 0;
        return intervalo;
    }
}
