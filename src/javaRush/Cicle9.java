package javaRush;
//Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
// Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
public class Cicle9 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;

        while (a <= 100) {
            if (a % 3 != 0) {
                sum = sum + a;
            }
            a++;
        }

        System.out.println(sum);
    }
}
