package javaRush;

import java.util.Scanner;

//Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
// пока пользователь не введет слово "ENTER".
// Вывести на экран полученную сумму и завершить программу.
public class Cicl2sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа для суммирования, когда нужен результат напишите Enter");

        int sum = 0;

        while (scanner.hasNextInt()){
            int num = scanner.nextInt();

            sum = sum+num;
        }
        System.out.println(sum);


    }
}
