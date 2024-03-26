package Lessons;
//Даны два различных вещественных числа. Определить:
//а) какое из них больше;
import java.util.Scanner;
public class Task4_6a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое вещественное число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе вещественное число:");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("Первое число (" + num1 + ") больше второго числа (" + num2 + ")");
        }
        else if (num1 < num2) {
            System.out.println("Второе число (" + num2 + ") больше первого числа (" + num1 + ")");
        }
        else {
            System.out.println("Оба числа равны (" + num1 + " = " + num2 + ")");
        }
    }
}
