class m2 {

    static void varAssignDiv() {
        int v = 2024;
        v = v / 10;
        v = v / 10;
        v = v / 10;
    }

    int firstDigit(int n) {
        int x = 10;
        while (n > x) {
            n = n / 10;
        }
        return n;
    }

    int lastDigit(int n) {
        int x = 10;
        while (n > x) {
            // Em programação (e em matemática de inteiros), o resto da divisão inteira por 10 é obtido com o operador módulo (%):
            n = n % 10;
        }
        return n;
    }

    static void naturalsIterator() {
        int i = 1;
        while (i < 5) {
            i = i + 1;
        }
    }

    int sumNaturals(int max) {
        int s = 0;
        int n = 1;
        while (n <= max) {
            s = s + n;
            n++;
        }
        return s;
    }

    int intervalLength(int min, int max) {
        int intervalo = max - min + 1;
        assert min >= 0 && max >= 0;
        return intervalo;
    }

    int multiplyDigits(int n) {
        // garante que n é um número natural (>=0)
        assert n >= 0;
        if (// caso excepcional, se o número é 0 (zero), irá devolver 0 (zero)
        n == 0)
            return 0;
        // tem de começar em "1" para pode multplicar
        int produto = 1;
        while (n > 0) {
            // último algarismo
            int algarismo = n % 10;
            produto = produto * algarismo;
            // remove o último algarismo
            n = n / 10;
        }
        return produto;
    }

    static void reverseIteration() {
        // começa em 5
        int x = 5;
        while (x > 0) {
            // enquanto x >= 0
            // decrementa 1
            x = x - 1;
        }
    }

    int factorial(int n) {
        assert n >= 0;
        int f = 1;
        int i = 1;
        while (i <= n) {
            f = f * i;
            i = i + 1;
        }
        return f;
    }

    int powerOfTwo(int e) {
        assert e >= 0;
        int b = 2;
        return (int) Math.pow(2, e);
    }

    /* solução alternativa :
 int powerOfTwo(int e) {
     assert e >= 0;
     int p = 1;
     int n = e;
     while(n > 0) {
         p = p * 2;
         n = n - 1;
     }
     return p;
}*/
    boolean isMultiple(int x, int y) {
        int soma = 0;
        while (soma < x) {
            // acumula y
            soma = soma + y;
        }
        // verdadeiro, se chegou exatamente a x
        return soma == x;
    }

    int intDivision(int x, int y) {
        // garantimos números válidos com esta asserção
        assert y >= 0 && x > 0;
        int quociente = 0;
        while (x >= y) {
            // enquando o dividendo "x" for maior do que o divisor "y"
            // tira uma vez o divisor "y"
            x = x - y;
            // conta mais uma subtração
            quociente++;
        }
        return quociente;
    }

    static void iterationStepTwo() {
        int p = 2;
        while (p < 10) {
            p = p + 2;
        }
    }

    int sumEvenBetween(int min, int max) {
        int n = min;
        int sum = 0;
        while (n <= max) {
            if (n % 2 == 0) {
                // verifica se é par
                // soma o próprio número
                sum = sum + n;
            }
            // avança para o próximo número
            n++;
        }
        // retorna a soma dos números pares dentro do intervalo [min,max]
        return sum;
    }

    boolean containsZero(int n) {
        // o próprio número "n" é pois zero (0)
        if (n == 0)
            return true;
        while (n > 0) {
            // último dígito
            int digito = n % 10;
            if (digito == 0) {
                // encontrou um zero (0)
                return true;
            }
            // removeu o último dígito
            n = n / 10;
        }
        // não enconbtrou um zero (0)
        return false;
    }

    int countDigit(int n, int d) {
        assert d >= 0 && d <= 9 : "d deve ser um dígito entre 0 e 9";
        int count = 0;
        // caso especial: se o número for 0
        // se o número "n" é zero (0) e d = 0 retorna 1 dígito zero (0)
        if (n == 0 && d == 0)
            return 1;
        while (n > 0) {
            // último dígito
            int digito = n % 10;
            if (digito == d) {
                // encontrou o dígito "d"
                // incrementa a contagem
                count = count + 1;
            }
            // removeu o último dígito
            n = n / 10;
        }
        // retorna a contagem do número de dígito "d"
        return count;
    }

    boolean existsDigit(int n, int d) {
        if (n < 0) {
            // Lida com números negativos
            n = -n;
        }
        while (n > 0) {
            if (n % 10 == d) {
                // Encontrou o dígito
                return true;
            }
            // Remove o último dígito do número
            n = n / 10;
        }
        // Não encontrou o dígito depois de verificar todos os dígitos
        return false;
    }

    // Solução Alternativa e melhor !
    // boolean existsDigit(int n, int d) {
    //     assert n >= 0 && d >= 0 && d <= 9;
    //     if(n == d) {
    //         return true;
    //     }
    //     int x = n;
    //     while(x > 0) {
    //         if(x % 10 == d) {
    //             return true;
    //         }
    //         x = x / 10;
    //     }
    //     return false;
    // }
    // Solução Ideal !
    // boolean existsDigit(int n, int d) {
    //     assert n >= 0 && d >= 0 && d <= 9 : "n deve ser >= 0 e d entre 0 e 9";
    //
    //     if (n == 0) return d == 0;        // único dígito é 0
    //
    //     while (n > 0) {
    //         int digito = n % 10;          // último dígito
    //         if (digito == d) return true; // encontrado
    //         n = n / 10;                   // remove o último dígito
    //     }
    //     return false;                     // não encontrou
    // }
    char nextLetter(char letra) {
        if (letra == 'z') {
            return 'a';
        } else {
            return (char) (letra + 1);
        }
    }

    int gcd(int a, int b) {
        assert a >= 0 && b >= 0 : "'a' e 'b'devem ser >=0";
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    // int gcd(int a, int b) {
    //
    //    assert a >= 0 && b >= 0 : "a e b devem ser >= 0"; // opcional: garantir naturais
    //
    //
    //    if (b == 0) return a; // casos de curto-circuito
    //    if (a == 0) return b; // casos de curto-circuito
    //
    //    while (b != 0) {
    //        int resto = a - b * (a / b); // equivalente a a % b sem usar %
    //        a = b;
    //        b = resto;
    //    }
    //    return a;
    // }
    int invertInt(int n) {
        int invertido = 0;
        while (n > 0) {
            int ultimo_digito = n % 10;
            invertido = invertido * 10 + ultimo_digito;
            n = n / 10;
        }
        return invertido;
    }

    // Algoritmo:
    //
    // 1.Inicializar uma variável invertido com o valor 0.
    //
    // 2. Repitir enquanto n for maior que 0 (ciclo while) :
    //
    // 2 a) Extrair o último dígito de n usando a operação de módulo: digito = n % 10.
    //
    // 2 b) Adicionar este dígito a invertido e deslocar os dígitos existentes uma posição para a esquerda, multiplicando invertido por 10 e somando o novo dígito:
    //      invertido = invertido * 10 + digito.
    //
    // 2 c) Remova o último dígito de n usando a divisão inteira por 10: n = n / 10.
    //
    // O valor final de invertido é o número invertido :
    //
    // invertInt(1234)-> 4321 ou  invertInt(12345)-> 54321
    // Esta solução que usa recursividade simples está correta mas é muito ineficiente, pois esta versão tem complexidade exponencial !
    // por repetir cálculos desnecessáriamente
    int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    // Solução alternativa mais complexa com recurso a um ciclo 'while' mas mais eficiente :
    //
    // int fib(int n) {
    //
    //    if (n <= 1) { // Casos base para n = 0 e n = 1
    //        return n;
    //    }
    //
    //    int termo_anterior = 0;
    //    int termo_atual = 1;
    //    int resultado = 0;
    //    int i = 2; // começa a partir do segundo termo (índice 2)
    //
    //    while (i <= n) {
    //        resultado = termo_anterior + termo_atual;
    //        termo_anterior = termo_atual;
    //        termo_atual = resultado;
    //        i++;
    //    }
    //    return resultado;
    // }
    // Solução interativa com ciclo 'for' ;
    //
    // int fib(int n) {
    //    if (n <= 1) return n;
    //    int anterior = 0; // F(0)
    //    int atual    = 1; // F(1)
    //    int resultado = 0;
    //    for (int i = 2; i <= n; i++) {
    //        resultado = anterior + atual; // F(i)
    //        anterior  = atual;
    //        atual     = resultado;
    //    }
    //    return resultado; // F(n)
    // }
}
