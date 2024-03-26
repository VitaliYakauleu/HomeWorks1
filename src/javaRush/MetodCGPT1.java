package javaRush;

import java.util.Scanner;

//Напишите метод, который принимает на вход два числа и возвращает их сумму.
public class MetodCGPT1 {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
         returnSum();
    }
    public static void returnSum(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a+b;
        System.out.println(sum);
    }

}
