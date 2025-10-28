class m3 {

    double absDiff(double a, double b) {
        return Math.abs(a - b);
    }

    int gradeRound(int n) {
        return (int) Math.round(n * 20.0 / 100.0);
    }

    // Solução Alternativa :
    //
    //
    //  int gradeRound(int grade) {
    //    double result = grade / 5.0;
    //    return (int) Math.round(result);
    //  }
    //
    //
    // 1) Nota inteira em 0-20 (mais comum) : (int) Math.round(percent * 20.0 / 100.0);
    //
    //
    // int percent = 79; // 79%
    // int nota20 = (int) Math.round(percent * 20.0 / 100.0); // 16
    // equivalente: (int) Math.round(percent / 5.0);
    //
    // 2) Se a percentagem é double (ex.: 79.3%) :
    //
    //
    // double percent = 79.3;
    // int nota20 = (int) Math.round(percent * 0.20); // 16
    //
    // 3) Manter 1 casa decimal em 0-20 (ex.: 15.9) :
    //
    //
    // double percent = 79.3;
    // double nota20_1cas = Math.round(percent * 0.20 * 10.0) / 10.0; // 15.9
    //
    //
    // 4) Converter diretamente de valores brutos (0..100, não em "%") :
    //
    // int pontos = 79; // 0..100
    // int nota20 = (int) Math.round(pontos / 5.0); // 16
    //
    int flipCoin(int a, int b) {
        double r = Math.random();
        if (r < 0.5) {
            // Solução Alternativa : return r < 0.5 ? a : b;
            return a;
        } else {
            return b;
        }
    }

    char randomVowel() {
        char[] vowel = { 'a', 'e', 'i', 'o', 'u' };
        // é 5 porque temos 5 vogais
        return vowel[(int) (Math.random() * 5)];
        // Solução Alternativa :
        //   char randomVowel() {
        //    double r = Math.random();
        //    if(r < .2) {
        //        return 'a';
        //    }
        //    if(r < .4) {
        //        return 'e';
        //    }
        //    if(r < .6) {
        //        return 'i';
        //    }
        //    if(r < .8) {
        //        return 'o';
        //    }
        //    return 'u';
        //   }
        //
        // Função para devolver uma letra do alfabeto minúscula aleatória :
        //
        // char random alphaBet() {
        //      char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //      return alphabet[(int)(Math.random() * 26)];
        // }
        //
        // Gerar automáticamente o "array" dentro do código Java (o resultado é igual ao array manual e ordenado em cima !) :
        //
        // char[] alphabet = new char[26];
        //      for (int i = 0; i < 26; i++) {
        //      alphabet[i] = (char) ('a' + i);
        // }
        //
    }

    boolean isBetween(int n, int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return (n > min && n < max);
        // 1. Descobre o limite inferior e superior:
        //
        // min = Math.min(a, b)
        // max = Math.max(a, b)
        //
        // 2. Compara n com os limites:
        //
        // n > min → significa que está acima do menor limite
        //
        // n < max → significa que está abaixo do maior limite
        //
        // 3. Ambas as condições devem ser verdadeiras:
        //
        // (n > min && n < max) retorna true se n estiver estritamente dentro do intervalo.
        //
        // Se estiver igual a um dos limites, retorna false (porque o intervalo é aberto ]a,b[.
    }
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
