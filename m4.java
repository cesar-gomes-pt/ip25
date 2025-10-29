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
