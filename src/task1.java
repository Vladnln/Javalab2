public class task1 {
    public static void main(String[] args) {
        double a = 3.0; // Длина первого ребра
        double b = 4.0; // Длина второго ребра
        double c = 5.0; // Длина третьего ребра

        // Вычисление объема
        double volume = a * b * c;

        // Вычисление площади поверхности
        double surfaceArea = 2 * (a * b + b * c + a * c);

        System.out.println("Объем параллелепипеда: " + volume);
        System.out.println("Площадь поверхности параллелепипеда: " + surfaceArea);
    }
}
