class m1 {

    int next(int n) {
        return n + 1;
    }

    int previous(int n) {
        return n - 1;
    }

    double doubleOf(double n) {
        return 2 * n;
    }

    int square(int n) {
        return n * n;
    }

    int difference(int a, int b) {
        return a - b;
    }

    double average(double a, double b) {
        return (double) (a + b) / 2;
    }

    double average(int a, int b) {
        return (double) (a + b) / 2;
    }

    int round(double n) {
        return (int) (n + 0.5);
    }

    boolean isNegative(int x) {
        return x < 0;
    }

    boolean isDigit(int x) {
        if (x >= 0 && x <= 9)
            return true;
        else
            return false;
    }

    boolean isEven(int x) {
        return x % 2 == 0;
    }

    boolean isOdd(int x) {
        return x % 2 != 0;
    }

    double abs(double x) {
        return (x > 0) ? x : -x;
    }

    // Solução Alternativa :
    //
    // double abs(double x) {
    //   return n < 0 ? -x : x;
    // }
    double min(double a, double b) {
        return (a < b) ? a : b;
    }

    // solução alternativa :
    //
    //double min(double a, double b) {
    //    if (a < b)
    //        return a;
    //    else
    //        return b;
    //}
    int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    double abs(double n) {
        if (n > 0)
            return n;
        else
            return -n;
    }

    int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    int irsgroup(int rendimento) {
        if (rendimento < 10000) {
            return 1;
        } else if (rendimento >= 10000 && rendimento <= 25000) {
            return 2;
        } else if (rendimento > 25000 && rendimento <= 48500) {
            return 3;
        } else {
            return 4;
        }
    }

    double irsTax(int escalao) {
        if (escalao == 1) {
            return 0.12;
        } else if (escalao == 2) {
            return 0.18;
        } else if (escalao == 3) {
            return 0.23;
        } else if (escalao == 4) {
            return 0.29;
        } else {
            return 0.0;
        }
    }

    int sumNaturals(int n) {
        // soma começa em zero "0"
        int s = 0;
        // variável contador que começa em 1
        int k = 1;
        while (k <= n) {
            // soma o valor actual de "k"
            s = s + k;
            // avança o contador para o valor seguinte : k = 1 (inicial), 2, 3,..., até "n"
            k++;
        }
        // devolve a soma total
        return s;
    }

    // solução alternativa #1 aplicando directamente a fómula de cálculo :
    //
    //int sumNaturals(int n) {
    //  return n * (n + 1) / 2;
    //}
    // solução alternativa #2 aplicando directamente a fómula de cálculo :
    //
    //int sumNaturals(int n) {
    //  assert n>=0;
    //  return (n * (n + 1) / 2);
    //}
    boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        else
            return false;
    }

    boolean inOrder(int a, int b, int c) {
        // Só devolve true quando a < b e b < c. E não permite números iguais nem desordenados.
        return a < b && b < c;
    }

    boolean isIncluded(int n, int min, int max) {
        return (n >= min && n <= max);
    }

    boolean isExcluded(int n, int min, int max) {
        return (n < min || n > max);
    }
}

class IrsUtil {

    static int irsGroup(int rendimento) {
        if (rendimento < 10000) {
            return 1;
        } else if (rendimento >= 10000 && rendimento <= 25000) {
            return 2;
        } else if (rendimento > 25000 && rendimento <= 48500) {
            return 3;
        } else {
            return 4;
        }
    }

    static double irsTax(int escalao) {
        if (escalao == 1) {
            return 0.12;
        } else if (escalao == 2) {
            return 0.18;
        } else if (escalao == 3) {
            return 0.23;
        } else if (escalao == 4) {
            return 0.29;
        } else {
            return 0.0;
        }
    }
}
