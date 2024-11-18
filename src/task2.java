public class task2 {
    public static void main(String[] args) {
        double R = 5.0; // Радиус окружности
        final double PI = 3.14; // Значение Пи

        // Вычисление длины окружности
        double circumference = 2 * PI * R;

        // Вычисление площади круга
        double area = PI * Math.pow(R, 2);

        System.out.println("Длина окружности: " + circumference);
        System.out.println("Площадь круга: " + area);
    }
}
