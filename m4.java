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
}
