package javaRush;

import java.util.Scanner;

public class Treugolnik {
    private static final String TRIUG_EXIST = "Треугольник существует";
    private static final String TRIUG_NOT_EXIST = "Треугольник не существует";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну трех сторон треугола");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if ((a + b > c) && (a + c > b) && (b + c > a))
        {
            System.out.println(TRIUG_EXIST);
        }else{
            System.out.println(TRIUG_NOT_EXIST);
        }


    }

}