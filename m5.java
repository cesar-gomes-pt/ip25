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

    void doubleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // dobra o valor atual de cada posição do array antigo !
            array[i] = array[i] * 2;
        }
    }

    int[] createDoubleArray(int[] array) {
        // cria um novo vetor com o mesmo tamanho do original
        int[] doubled = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            // percorre todas as posições do vetor original
            // coloca no novo vetor o dobro do valor original
            doubled[i] = array[i] * 2;
        }
        // devolve o novo vetor com todos os valores duplicados
        return doubled;
    }

    void invertValues(boolean[] array) {
        // 1) declara a variável de índice i
        int i;
        for (i = 0; i < array.length; i++) {
            // 2) percorre o vetor do índice 0 até ao último
            // 3) inverte o valor booleano: true -> false e false -> true !
            array[i] = !(array[i]);
        }
    }

    void scaleArray(double[] array, double factor) {
        // 1) percorre todas as posições do vetor, do índice 0 ao último
        for (int i = 0; i < array.length; i++) {
            // 2) multiplica o elemento atual pelo fator e guarda o resultado no próprio vetor
            array[i] = array[i] * factor;
        }
    }

    void replace(char[] letters, char find, char replace) {
        // percorre todas as posições do vetor
        for (int i = 0; i < letters.length; i++) {
            // se o caractere atual for igual ao que queremos encontrar
            if (letters[i] == find) {
                // substitui pelo novo caractere
                letters[i] = replace;
            }
        }
    }

    static void constrain(double[] array, double minimum_interval, double maximum_interval) {
        // 1) percorre todas as posições do vetor, do índice 0 ao último
        for (int i = 0; i < array.length; i++) {
            // 2) se o valor atual for menor do que o limite inferior,
            //    substitui-o pelo próprio limite inferior (clamp inferior)
            if (array[i] < minimum_interval) {
                array[i] = minimum_interval;
                // 3) caso contrário, se for maior do que o limite superior,
                //    substitui-o pelo limite superior (clamp superior)
            } else if (array[i] > maximum_interval) {
                array[i] = maximum_interval;
            }
            // 4) caso contrário (já está dentro do intervalo), não altera
        }
    }
}

class ArrayOrder {

    static void swap(int[] array, int i, int j) {
        // swap: troca os elementos nas posições i e j do array (in-place)
        // 1) guarda temporariamente o valor na posição i
        int modify = array[i];
        // 2) coloca o valor da posição j na posição i
        array[i] = array[j];
        // 3) repõe, na posição j, o valor originalmente de i
        array[j] = modify;
    }

    // invert: inverte a ordem dos elementos do array (in-place)
    static void invert(int[] array) {
        // 1) índice do fim do array (último elemento)
        int j = array.length - 1;
        // 2) número de trocas necessárias (metade do tamanho)
        int ceil = array.length / 2;
        // 3) percorre do início até ao meio (exclusive quando length é ímpar)
        for (int i = 0; i < ceil; i++) {
            // 4) troca o elemento do início (i) com o do fim (j)
            swap(array, i, j);
            // 5) move o índice do fim para a esquerda
            j--;
        }
        // 6) fim: o array fica invertido; se o comprimento for ímpar, o do meio permanece
    }
}

class Shift {

    static void shiftLeft(int[] array) {
        // 1) índice do último elemento
        int lastIndex = array.length - 1;
        // 2) guarda o primeiro valor (será colocado no fim)
        int firstValue = array[0];
        for (int i = 0; i <= lastIndex; i++) {
            // 3) percorre todas as posições de 0 até lastIndex
            if (i == lastIndex) {
                // 4) caso especial: última posição
                // 5) coloca o antigo primeiro valor no fim
                array[i] = firstValue;
            } else {
                // 6) desloca cada elemento para a esquerda
                array[i] = array[i + 1];
            }
        }
    }

    static void shiftRight(int[] array) {
        // 1) índice do último elemento
        int lastIndex = array.length - 1;
        // 2) guarda o último valor (irá para o início)
        int lastValue = array[lastIndex];
        for (int i = lastIndex; i >= 0; i--) {
            // 3) percorre de trás para a frente
            if (i == 0) {
                // 4) caso especial: primeira posição
                // 5) coloca o antigo último valor no início
                array[i] = lastValue;
            } else {
                // 6) desloca cada elemento para a direita
                array[i] = array[i - 1];
            }
        }
    }
}
