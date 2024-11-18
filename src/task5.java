public class task5 {
    public static void main(String[] args) {
        int x = 3; // Первое число
        int y = 4; // Второе число

        // Квадраты чисел
        int xSquare = x * x;
        int ySquare = y * y;

        // Сумма квадратов
        int sumOfSquares = xSquare + ySquare;

        // Разность квадратов
        int differenceOfSquares = xSquare - ySquare;

        // Произведение квадратов
        int productOfSquares = xSquare * ySquare;

        // Частное квадратов
        double quotientOfSquares = (double)xSquare / ySquare;

        System.out.println("Сумма квадратов: " + sumOfSquares);
        System.out.println("Разность квадратов: " + differenceOfSquares);
        System.out.println("Произведение квадратов: " + productOfSquares);
        System.out.println("Частное квадратов: " + quotientOfSquares);
    }
}
