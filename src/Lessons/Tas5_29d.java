package Lessons;

import java.util.Scanner;

//среднее арифметическое всех целых чисел от a до 200 (значения a и b вво-
//дятся с клавиатуры; a 200);
public class Tas5_29d {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ent num 1:");
        int a = scanner.nextInt();
        System.out.println("Ent num 2:");
        int b = scanner.nextInt();
        int count = 0;
        for (int i = a; i>=b ; i++) {
           count ++;

        }

    }
}
