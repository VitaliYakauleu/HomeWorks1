package Tasks;

import java.util.Scanner;
///в) третьи степени всех целых чисел от a до 50 (значение a вводится с клавиа-
////туры; a 50);
public class Tas5_3c {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите цифру    ");
        int a = num.nextInt();
        for (int i = a; i <=50; i++) {
            double triple = Math.pow(i,3);
            System.out.println(triple);

        }
    }
}
