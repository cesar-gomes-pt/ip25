class m6 {
}

class MatrixUtil {

    // isRectangular: verifica se todas as linhas têm o mesmo comprimento.
    // Considera matriz vazia (0 linhas) como bem formada (true).
    static boolean isRectangular(int[][] m) {
        // 1) segurança básica: matriz nula não é válida
        if (m == null)
            return false;
        // 2) número de linhas
        int rows = m.length;
        // 3) matriz vazia é considerada bem formada
        if (rows == 0)
            return true;
        // 4) comprimento da 1.a linha (referência)
        int cols = m[0].length;
        for (int i = 1; i < rows; i++) {
            // 5) percorre as restantes linhas
            // 6) linha nula quebra a "boa formação"
            if (m[i] == null)
                return false;
            // 7) se alguma linha tiver comprimento diferente → não retangular
            if (m[i].length != cols)
                return false;
        }
        // 8) todas as linhas com o mesmo comprimento
        return true;
    }

    // isSquare: matriz quadrada ⇢ bem formada E (#linhas == #colunas).
    // Por convenção, uma matriz 0x0 é quadrada (true).
    static boolean isSquare(int[][] m) {
        // 1) tem de ser bem formada primeiro
        if (!isRectangular(m))
            return false;
        // 2) conta linhas
        int rows = m.length;
        // 3) 0x0 é quadrada
        if (rows == 0)
            return true;
        // 4) colunas (todas iguais pois é retangular)
        int cols = m[0].length;
        // 5) quadrada se linhas == colunas
        return rows == cols;
    }

    // totalElements: total de elementos da matriz (soma dos comprimentos das linhas).
    // Funciona para qualquer matriz (retangular ou não).
    static int totalElements(int[][] m) {
        // 1) matriz nula → 0 elementos
        if (m == null)
            return 0;
        // 2) acumulador
        int total = 0;
        for (int i = 0; i < m.length; i++) {
            // 3) percorre cada linha
            if (m[i] != null) {
                // 4) ignora linhas nulas (se existirem)
                // 5) soma a quantidade de elementos da linha
                total += m[i].length;
            }
        }
        // 6) devolve o total
        return total;
        // Solução proposta !
        //
        // class MatrixUtil {
        //
        //    static boolean isRectangular(int[][] m) {
        //        if (m.length == 0)              // matriz vazia (0 linhas) é considerada bem formada
        //            return true;
        //        int len = m[0].length;          // comprimento (no de colunas) da 1a linha como referência
        //        for (int i = 1; i < m.length; i++)  // percorre as restantes linhas
        //            if (m[i].length != len)     // se alguma linha tiver comprimento diferente...
        //                return false;           // ...não é retangular (mal formada)
        //        return true;                    // todas as linhas têm o mesmo comprimento
        //    }
        //
        //    static boolean isSquare(int[][] m) {
        //        if (!isRectangular(m))          // para ser quadrada, tem de ser bem formada
        //            return false;
        //        if (m.length == 0)              // convenção: 0x0 é quadrada
        //            return true;
        //        return m.length == m[0].length; // quadrada se no de linhas == no de colunas
        //    }
        //
        //    static int totalElements(int[][] m) {
        //        int c = 0;                          // acumulador de elementos
        //        for (int i = 0; i < m.length; i++)  // percorre cada linha
        //            c += m[i].length;               // soma o tamanho (no de colunas) da linha
        //        return c;                           // total de elementos na matriz
        //    }
        // }
    }
}
