package javaRush;
//Исправь методы класса Solution, используя класс Math:
// 1. sqrt(double) - должен возвращать квадратный корень переданного аргумента.
// 2. cbrt(double) - должен возвращать кубический корень переданного аргумента.
// 3. pow(int, int) - должен возвращать значение первого аргумента, возведенного в степень второго аргумента
public class Task9_2 {
    public static void main(String[] args) {
        int a= 25;
        int b =9;
        int x = Math.min(a, b);
        System.out.println(x);
    }
}
