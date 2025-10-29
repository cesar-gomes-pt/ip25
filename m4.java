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
}
