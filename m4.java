class m4 {

    static void arrayRead() {
        int[] numbers = { 4, 3, 2, 1 };
        int sum = numbers[0];
        sum = sum + numbers[1];
        sum = sum + numbers[2];
        sum = sum + numbers[3];
    }

    int sum(int[] array) {
        int i = 0;
        int sum = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        return sum;
        // solução alternativa :
        //
        // int sum(int[] array) {
        //
        //     int total = 0;
        //     int i = 0;
        //
        //     for (i = 0; i < array.length; i++) {
        //        total += array[i];
        //     }
        //     return total;
        // }
        //
    }

    static void arrayOfDigits() {
        int[] digits = new int[10];
        int i = 0;
        while (i < 10) {
            digits[i] = i;
            i++;
        }
    }

    int[] naturals(int n) {
        assert n >= 0 : "argumento não pode ser negativo";
        int[] nats = new int[n];
        int i = 0;
        while (i < n) {
            nats[i] = i + 1;
            i++;
        }
        return nats;
    }

    boolean isOrdered(int[] array) {
        int i = 1;
        while (i < array.length) {
            if (array[i] < array[i - 1]) {
                i++;
                // encontrou inversão: não está ordenado
                return false;
            }
            i++;
        }
        // percorreu tudo sem inversões, ou seja, está tudo ordenado !
        return true;
    }

    // Passo 1. Se o array tiver 0 ou 1 elemento, está ordenado por definição (o laço não executa e devolvemos true no fim).
    // Passo 2. Começa a verificação no segundo elemento (índice 1), porque vamos comparar cada elemento com o anterior.
    // Passo 3. Enquanto i < array.length, compara array[i] com array[i-1].
    // Passo 4. Se encontrar uma inversão (array[i] < array[i-1]), devolve false imediatamente (não está ordenado).
    // Passo 5. Se não houver inversão, incrementa i e continua.
    // Passo 6. Se o laço terminar sem inversões, devolve true (está ordenado).
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Solução equivalente com um ciclo 'for'
    //
    // static boolean isOrdered(int[] array) {
    //    for (int i = 1; i < array.length; i++) {
    //        if (array[i] < array[i - 1]) return false; // encontrou inversão: não está ordenado !
    //    }
    //    return true; // percorreu tudo sem inversões, ou seja, está tudo ordenado !
    // }
    // Passo 1. Itera de i = 1 até i < array.length.
    // Passo 2. Para cada posição i, compara array[i] com array[i-1].
    // Passo 3. Se array[i] < array[i-1], encontrou uma inversão → retorna false.
    // Passo 4. Se terminar o for sem inversões, retorna true
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Notas Finais :
    //
    // 1. Funciona para arrays vazios ([]) e de 1 elemento ([x]): retorna true.
    //
    // 2. Para permitir ordem não estrita (permitir iguais), troque a condição por array[i] < array[i - 1] (já permite iguais).
    //
    // 3. Para exigir ordem estritamente crescente (sem repetidos), use array[i] <= array[i - 1].
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    int[] inverted(int[] array) {
        int[] new_array = new int[array.length];
        int length = array.length;
        int index = length - 1;
        int i = 0;
        while (i < length) {
            new_array[i] = array[index];
            i++;
            index--;
        }
        return new_array;
    }

    // Passo 1. Cria um novo array new_array com o mesmo tamanho do array original, onde será guardado o resultado invertido.
    // Passo 2. Guarda o comprimento em length para evitar chamar array.length repetidamente.
    // Passo 3. Inicializa index = length - 1 para começar a ler o último elemento do array original.
    // Passo 4. Inicializa o índice de escrita i = 0 para começar a preencher new_array do início.
    // Passo 5. Entra no ciclo while (i < length) que vai percorrer todas as posições.
    // Passo 6. Copia o elemento espelhado: new_array[i] = array[index]; Lê do fim do original (index) e escreve no início do novo (i).
    // Passo 7. Avança os ponteiros em sentidos opostos: i++ (para a direita no novo) e index-- (para a esquerda no original).
    // Passo 8. Quando i == length, o ciclo termina: todos os elementos foram copiados.
    // Passo 9. Retorna new_array, que é o array original invertido.
    //
    // Observações: Funciona para arrays vazios e de 1 elemento (retorna o próprio array copiado/invertido).
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Solução Alternativa :
    //
    // int[] inverted(int[] array) {
    //    int[] inv = new int[array.length];
    //    int i = 0;
    //    while(i < array.length) {
    //        inv[i] = array[array.length - 1 - i];
    //        i = i + 1;
    //    }
    //    return inv;
    // }
    // Passo 1. Cria inv com o mesmo tamanho do array original para guardar o resultado.
    // Passo 2. Inicializa i = 0 como índice de escrita no array inv.
    // Passo 3. Inicia o ciclo while (i < array.length) para percorrer todas as posições de 0 até length-1.
    // Passo 4. Para cada i, calcula diretamente o índice espelhado do original: array.length - 1 - i. Ex.: para i=0 lê array[length-1];
    //          para i=1 lê array[length-2], etc.
    //
    // Passo 5. Copia o valor espelhado: inv[i] = array[array.length - 1 - i];.
    // Passo 6. Incrementa i (i = i + 1) para avançar no array de destino.
    // Passo 7. Ao terminar o ciclo, inv contém o conteúdo de array invertido.
    // Passo 8. Retorna inv.
    //
    // Observações: É uma forma mais compacta: dispensa a variável index, calculando o índice espelhado inline.
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    boolean contains(int[] array, int n) {
        int i = 0;
        int size = array.length;
        while (i < size) {
            if (array[i] == n) {
                return true;
            }
            i++;
        }
        return false;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // 1) começa a pesquisar desde o índice 0 -> int i = 0;
    //
    // 2) guarda o tamanho do array (evita ler length a cada volta) -> int size = array.length;
    //
    // 3) percorre o array enquanto houver elementos -> while (i < size)
    //
    // 4) compara o elemento atual com o valor procurado -> if (array[i] == n)
    //
    // 5) se encontrou, termina já: existe no array -> return true;
    //
    // 6) avança para o próximo índice -> i++;
    //
    // 7) terminou o ciclo sem encontrar: não existe -> return false;
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    int count(int[] array, int n) {
        int size = array.length;
        int counter = 0;
        int i = 0;
        while (i < size) {
            if (array[i] == n) {
                counter++;
            }
            i++;
        }
        return counter;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //Passo 1. int size = array.length; Guarda o tamanho do array para usar no laço (evita consultar length em cada iteração).
    //
    //Passo 2. int counter = 0; Inicializa o contador de ocorrências de n no array.
    //
    //Passo 3. int i = 0; Começa a percorrer o array pelo índice inicial.
    //
    //Passo 4. while (i < size) { ... }. Itera por todos os índices válidos (0 até size-1).
    //
    //Passo 5. if (array[i] == n) { counter++; }. Se o elemento da posição atual é igual a n, incrementa o contador (encontrou mais uma ocorrência).
    //
    //Passo 6. i++; Avança para o próximo índice.
    //
    //Passo 7. return counter; Depois de percorrer o array inteiro, devolve o número total de vezes que n apareceu.
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    boolean areEqual(int[] a, int[] b) {
        // 1) guarda o tamanho do array a
        int size_a = a.length;
        // 2) guarda o tamanho do array b
        int size_b = b.length;
        // 3) índice para percorrer os arrays
        int i = 0;
        if (size_a != size_b) {
            // 4) se os tamanhos diferem, não podem ser iguais
            return false;
        }
        while (i < size_a) {
            // 5) percorre todas as posições válidas
            if (a[i] != b[i]) {
                // 6) se algum par de elementos diferir, os arrays não são iguais
                return false;
            }
            // 7) avança para a próxima posição
            i++;
        }
        // 8) terminou sem diferenças: arrays iguais
        return true;
        /////////////////////////////////////////////////////////////////////////////////////////////
        //
        // Nota Importante : 2 arrays para serem considerado iguais tem de possuir 3 condições:
        //
        // 1. Ser do mesmo tipo.
        // 2. Ter mesmo tamanho
        // 3. E os seus elementos serem iguais.
        //
        /////////////////////////////////////////////////////////////////////////////////////////////
    }

    int[] merge(int[] left, int[] right) {
        // comprimento do vetor left
        int length_left = left.length;
        // comprimento do vetor right
        int length_right = right.length;
        // tamanho total da concatenação
        int total_length = length_left + length_right;
        // cria vetor de destino com o tamanho final
        int[] merged_array = new int[total_length];
        // índice de iteração
        int i = 0;
        // copia os elementos de left para o início de merged_array
        while (i < length_left) {
            // coloca left[i] na mesma posição
            merged_array[i] = left[i];
            // avança o índice
            i++;
        }
        // reinicia o índica para percorrer o vetor right
        i = 0;
        // copia os elementos de right a seguir aos de left
        while (i < length_right) {
            // desloca por length_left
            merged_array[i + length_left] = right[i];
            // avança o índice
            i++;
        }
        // devolve o vetor concatenado !
        return merged_array;
    }
}

class ArrayCopy {

    static int[] copyNewSize(int[] source_array, int n) {
        int size = source_array.length;
        int i = 0;
        int[] targer_array = new int[n];
        while (i < n) {
            if (i < size) {
                targer_array[i] = source_array[i];
            } else {
                targer_array[i] = 0;
            }
            i++;
        }
        return targer_array;
    }

    // Função - copyNewSize(int[] source_array, int n) :
    //
    // Passo 1. int size = source_array.length; Guarda o comprimento do array de origem para acesso rápido.
    //
    // Passo 2. int i = 0; Inicializa o índice que vai percorrer a posição de escrita no array destino.
    //
    // Passo 3. int[] target_array = new int[n]; Cria o array de destino com tamanho pedido n. Por omissão, está preenchido com zeros.
    //
    // Passo 4. while (i < n) { ... } Itera por todas as posições do array destino (de 0 a n-1).
    //
    // Passo 5. if (i < size) { target_array[i] = source_array[i]; }. Enquanto houver elemento correspondente no array de origem (i.e., i ainda é um índice válido em source_array), copia esse elemento.
    //
    // Passo 6. else { target_array[i] = 0; }. Se i já ultrapassou o tamanho do array de origem (ou seja, n > size), preenche com 0 (padding).
    //
    // Passo 7. i++; Avança para a próxima posição do array destino.
    //
    // Passo 8. return target_array; Depois de preencher n posições, devolve o novo array.
    //
    // Comportamento resumido :
    //
    // Se n == size: devolve uma cópia exata.
    //
    // Se n < size: devolve uma cópia truncada (só os primeiros n elementos).
    //
    // Se n > size: devolve uma cópia com padding de zeros no fim.
    static int[] copy(int[] source_array) {
        return copyNewSize(source_array, source_array.length);
    }
    // Função - copy(int[] source_array) :
    //
    // Passo 1. Lê o tamanho do array de origem: source_array.length.
    //
    // Passo 2. Chama copyNewSize(source_array, source_array.length). Pede uma cópia do mesmo tamanho → o resultado é uma cópia fiel do array original.
    //
    // Passo 3. Devolve o array copiado.
    //
    // Exemplos rápidos :
    //
    // copyNewSize([1,2,3], 5) → [1,2,3,0,0] (padding)
    //
    // copyNewSize([1,2,3], 2) → [1,2] (truncado)
    //
    // copy([4,5]) → [4,5] (cópia igual)
}

class RandomArray {

    // ---------------------------------------------
    // 1) randomArray: constrói um vetor de comprimento n
    //    preenchido com dígitos aleatórios no intervalo [0..9].
    // ---------------------------------------------
    static int[] randomArray(int n) {
        // Validação: o comprimento não pode ser negativo
        if (n < 0) {
            throw new IllegalArgumentException("O comprimento deve ser >= 0");
        }
        // Cria o vetor de destino com n posições (inicialmente todas 0)
        int[] a = new int[n];
        // Índice de preenchimento
        int i = 0;
        // Preenche cada posição com um dígito aleatório 0..9
        while (i < n) {
            // Math.random() -> [0.0,1.0)
            // * 10          -> [0.0,10.0)
            // (int)         -> {0,1,2,3,4,5,6,7,8,9}
            a[i] = (int) (Math.random() * 10);
            i++;
        }
        // Devolve o vetor gerado
        return a;
    }

    // ---------------------------------------------
    // 2) randomIndex: devolve um índice aleatório válido
    //    para o vetor dado (intervalo [0 .. length-1]).
    // ---------------------------------------------
    static int randomIndex(int[] array) {
        // Validação: o vetor não pode ser nulo nem vazio
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O vetor não pode ser nulo/vazio");
        }
        // Math.random() -> [0.0,1.0)
        // * length      -> [0.0,length)
        // (int)         -> {0,1,...,length-1}
        return (int) (Math.random() * array.length);
    }

    // ---------------------------------------------
    // 3) randomElement: devolve um elemento aleatório
    //    do vetor, reutilizando randomIndex(array).
    // ---------------------------------------------
    static int randomElement(int[] array) {
        // Sorteia um índice válido e usa-o para aceder ao elemento
        return array[randomIndex(array)];
    }
}

class doubleStats {

    // Conjunto de utilitários para vetores de double: min, max, sum, average :
    static double min(double[] array) {
        // 1) guarda o tamanho
        int size = array.length;
        // 2) assume o 1.o elemento como mínimo
        double min = array[0];
        // 3) índice de varrimento
        int i = 0;
        while (i < size) {
            // 4) percorre todas as posições [0 .. size-1]
            if (i > 0) {
                // 5) ignora a comparação quando i == 0 (opcional)
                if (array[i] < min) {
                    // 6) se encontrou valor menor que o atual mínimo
                    // 7) atualiza o mínimo
                    min = array[i];
                }
            }
            // 8) avança para o próximo índice
            i++;
        }
        // 9) devolve o mínimo encontrado
        return min;
    }

    static double max(double[] array) {
        // 1) guarda o tamanho
        int size = array.length;
        // 2) assume o 1.o elemento como máximo
        double max = array[0];
        // 3) índice de varrimento
        int i = 0;
        while (i < size) {
            // 4) percorre o array
            if (i > 0) {
                // 5) evita comparar no i == 0 (opcional)
                if (array[i] > max) {
                    // 6) se encontrou valor maior que o atual máximo
                    // 7) atualiza o máximo
                    max = array[i];
                }
            }
            // 8) próximo elemento
            i++;
        }
        // 9) devolve o máximo encontrado
        return max;
    }

    static double sum(double[] array) {
        // 1) tamanho do array
        int size = array.length;
        // 2) acumulador da soma
        double sum = 0.0;
        // 3) índice
        int i = 0;
        while (i < size) {
            // 4) percorre todos os elementos
            // 5) acumula o valor atual
            sum += array[i];
            // 6) avança o índice
            i++;
        }
        // 7) devolve a soma total
        return sum;
    }

    static double average(double[] array) {
        // 1) número de elementos
        int size = array.length;
        // 2) usa a função sum para obter o total
        double average = sum(array);
        // 3) média = soma / tamanho
        return average / size;
    }
}
