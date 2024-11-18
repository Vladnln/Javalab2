public class task4 {
    public static void main(String[] args) {
        int a = 16; // Первое число
        int b = 25; // Второе число

        if (a >= 0 && b >= 0) {
            // Вычисляем среднее геометрическое
            double geometricMean = Math.sqrt(a * b);

            System.out.println("Среднее геометрическое чисел " + a + " и " + b + ": " + geometricMean);
        } else {
            System.err.println("Числа должны быть неотрицательными.");
        }
    }
}
