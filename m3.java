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

class IrsHelper {

    static double irsTaxByIncome(int income) {
        int group = IrsUtil.irsGroup(income);
        // 1) Devolve a taxa de IRS correspondente ao rendimento
        return IrsUtil.irsTax(group);
    }

    static int groupByTax(double tax) {
        for (int group = 1; group <= 4; group++) {
            if (IrsUtil.irsTax(group) == tax) {
                // comparação direta
                // 2) Devolve o grupo correspondente a uma taxa (ou 0 se inválida)
                return group;
            }
        }
        // taxa não pertence a nenhum grupo válido
        return 0;
    }
}
