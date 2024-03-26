package Lessons;

import java.util.Scanner;

//в) среднее арифметическое всех целых чисел от a до 200 (значения a и b вво-
//дятся с клавиатуры; a 200);
public class Tas5_29c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num 1  :");
        int a = scanner.nextInt();
        System.out.println("Enter num 2  :");
        int b = scanner.nextInt();
        int res = 0;
        int count = 0;
        for (int i = a; i <=b ; i++) {
            count++;
            res = res + i;


            //System.out.println(i);

        }
        int avnum = res/count;
        System.out.println(avnum);

    }
}
