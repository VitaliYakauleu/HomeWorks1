package javaRush;
//Давай используем цикл for, чтобы вывести на экран прямоугольный треугольник из восьмёрок со сторонами (катетами) 10 и 10.
// То есть в первой строке должна быть одна 8, начиная слева, во второй - две и т.д.
public class Cicle13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8 ");
            }
            System.out.println();
        }
    }
}
