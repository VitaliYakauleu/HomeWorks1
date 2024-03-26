package Lessons;
//В переменной n хранится натуральное (целое) трехзначное число.
// Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
public class Task02 {
   public static void main(String[] args) {
       int n = 539;
       int sum = 0;
       int SearchDig;

       SearchDig = n % 10;
       sum = sum + SearchDig;

       n = n / 10;

       SearchDig = n % 10;
       sum = sum + SearchDig;

       n = n / 10;

       sum = sum + n;

       System.out.println(sum);

   }
}
