package Lessons;
//В переменных х и y хранятся два натуральных числа. Создайте программу, выводящую на консоль:
//■ результат целочисленного деления x на y;
//■ остаток от деления x на y;
//■ квадратный корень x.
public class Task01 {
    public static void main(String[] args) {
     int x = 14;
     int y = 3;
     int a = x / y;
     int b = x % y;
     double c = Math.sqrt(x);
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);

    }
}
