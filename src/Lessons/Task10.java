package Lessons;

import java.util.Scanner;

//Написать программу расчета идеального веса к росту. В
//константах хранятся рост (height) и вес (weight). Вывести на
//консоль сообщение, сколько килограмм нужно набрать или
//сбросить (идеальный вес = рост - 110).
public class Task10 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ваш рост см    ");
        final int height = num.nextInt();

        System.out.println("Ваш вес кг     ");
        final int weight = num.nextInt();
        int result = (height - 110) - weight;
        System.out.println("Вам стоит набрать если без минуса или сбросить если с минусом " + result + " килограммов " );

    }
}
