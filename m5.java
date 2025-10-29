class m5 {

    static void incrementation() {
        // A seguinte sequência de instruções faz com que a variável i tome os valores 1, 2, 3, 4.
        // Altere o código por forma a manter este comportamento utilizando a instrução de incrementação (++) :
        int i = 1;
        i++;
        i++;
        i++;
    }

    static void cumulativeAssign() {
        // A seguinte sequência de instruções faz com que a variável n tome os valores 1, 3, 6, 10.
        // Altere o código por forma a manter este comportamento utilizando a instrução de atribuição cumulativa (+=) :
        int n = 1;
        n += 2;
        n += 3;
        n += 4;
    }

    static void whileToFor() {
        // O seguinte ciclo faz com que a variável s acumule os valores 1, 2, 3, 4, 5, terminando com o valor 15.
        // Altere o código por forma a manter este comportamento utilizando o ciclo 'for' :
        // 1) inicializa o acumulador s com 0
        int s = 0;
        // 2) declara i (valor inicial aqui não importa, o for vai redefinir)
        int i = 1;
        for (i = 1; i <= 5; i++) {
            // 3) laço: começa em i=1; repete enquanto i<=5; incrementa i a cada volta
            // 4) s = s + i  → acumula o valor atual de i em s
            s += i;
        }
    }
}
