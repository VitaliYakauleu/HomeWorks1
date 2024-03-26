package Lessons;
//Подсчитать площадь и длину окружности для круга с радиусом R.
// Радиус должен быть задан константой в программе. Вывести результат на консоль.
//Формула: L = 2 * π * R влина окружности

public class Task05 {
    public static void main(String[] args) {
        final int R = 50;
        double pi = Math.PI;
        double circLenght = 2 * pi * R;
        double area = pi * (R * R);
        System.out.println("Длина окружности = " + circLenght);
        System.out.println("Площадь круга = " + area);

    }
}
