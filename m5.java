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

    void replaceFirst(char[] letters, char find, char replace) {
        // Percorre o vetor desde o início
        for (int i = 0; i < letters.length; i++) {
            // Se encontrar o caractere procurado...
            if (letters[i] == find) {
                // ...substitui pela nova letra
                letters[i] = replace;
                // E sai imediatamente: só a primeira ocorrência é alterada !
                return;
            }
        }
    }

    void replaceLast(char[] letters, char find, char replace) {
        // 1) percorre o vetor de trás para a frente:
        //    começa no último índice (length - 1) e vai até 0, inclusive
        for (int i = letters.length - 1; i >= 0; i--) {
            // 2) se o elemento atual for igual ao caractere que procuramos...
            if (letters[i] == find) {
                // 3) ...substitui-o pelo novo caractere
                letters[i] = replace;
                // 4) e termina imediatamente:
                //    como percorremos de trás para a frente, esta é a ÚLTIMA ocorrência
                return;
            }
        }
    }

    // Solução proposta :
    //
    // void replaceLast(char[] letters, char find, char replace) {
    //
    //    // percorre o vetor de trás para a frente: começa no último índice
    //
    //    for (int i = letters.length - 1; i >= 0; i--)
    //
    //        // se o caractere na posição i for o que procuramos...
    //
    //        if (letters[i] == find) {
    //
    //            letters[i] = replace;         // ...substitui-o
    //
    //            return;                       // e termina: sendo de trás para a frente, é a ÚLTIMA ocorrência
    //        }
    // }
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

class shuffle {

    static void randomSwap(int[] array) {
        int i = RandomInts.randomUntil(array.length);
        int j = RandomInts.randomUntil(array.length);
        ArrayOrder.swap(array, i, j);
    }

    static void shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int r = RandomInts.randomWithin(0, i);
            ArrayOrder.swap(array, r, i);
        }
    }
}

class RandomInts {

    static int random() {
        return (int) (Math.random() * 1000000);
    }

    static int randomUntil(int max) {
        assert max > 0;
        return (int) (Math.random() * max);
    }

    static int randomWithin(int min, int max) {
        assert min < max;
        return min + randomUntil(max - min + 1);
    }
}

// Solução Proposta !
//
// class ArrayShuffle {
//
//     static void randomSwap(int[] array) {
//         int i = RandomInts.randomUntil(array.length); // índice aleatório em [0..length-1]
//         int j = RandomInts.randomUntil(array.length); // outro índice aleatório em [0..length-1]
//         ArrayOrder.swap(array, i, j);                 // troca in-place os elementos nas posições i e j
//     }
//
//     static void shuffle(int[] array) {
//         // Fisher-Yates: percorre de trás para a frente, fixando cada posição i
//         for (int i = array.length - 1; i > 0; i--) {  // i desce do último índice até 1
//             int r = RandomInts.randomWithin(0, i);    // escolhe r uniformemente em [0..i]
//             ArrayOrder.swap(array, r, i);             // coloca um elemento aleatório do prefixo [0..i] na posição i
//         }                                             // no fim, o array é uma permutação aleatória uniforme
//     }
// }
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

class BubbleSort {

    // Ordena por ordem crescente usando ArrayOrder.swap
    static void sort(int[] array) {
        if (array == null || array.length < 2)
            return;
        int n = array.length;
        while (true) {
            // 1) nesta passada ainda não trocámos nada
            boolean swapped = false;
            for (int i = 1; i < n; i++) {
                // 2) percorre pares adjacentes [i-1, i]
                if (array[i - 1] > array[i]) {
                    // 3) fora de ordem? troca
                    ArrayOrder.swap(array, i - 1, i);
                    // 4) houve troca neste passo
                    swapped = true;
                }
            }
            // 5) último elemento já está no lugar
            n--;
            // 6) sem trocas → já está ordenado
            if (!swapped)
                break;
        }
    }
}
// Solução proposta e mais simples !
//
// class ArraySort {
//
//     // bubble sort (crescente)
//
//      static void sort(int[] array) {
//
//      //Laço externo: define o limite superior j que vai diminuindo
//
//          for (int j = array.length - 1; j > 0; j--) {
//
//
// Laço interno: percorre e compara pares adjacentes até j-1
//
//              for (int i = 0; i < j; i++) {
//
//      // Se o par está fora de ordem, troca-os
//
//                  if (array[i] > array[i + 1]) {
//                     ArrayOrder.swap(array, i, i + 1);
//                 }
//             }
//
//      // No fim desta passada, o maior dos elementos remanescentes ficou em array[j]
//
//         }
//     }
// }
//
