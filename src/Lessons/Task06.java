package Lessons;
//Есть прямоугольник, у которого известна ширина w и
//высота h. Найти и вывести на консоль периметр и площадь
//заданного прямоугольника. Высота и ширина прямоугольника должна задаваться константными переменными в коде
//программы.
//P = (a + b) · 2
// S = a * b
public class Task06 {
    public static void main(String[] args) {
        final int w = 10;
        final int h = 5;
        double perim = (w + h) * 2;
        double area = w * h;
        System.out.println("Периметр = " + perim);
        System.out.println("Площадь = " +area);

    }
}
