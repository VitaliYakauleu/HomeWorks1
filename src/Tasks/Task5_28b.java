package Tasks;

import java.util.Scanner;

//б) произведение всех целых чисел от a до 20 (значение a вводится с клавиату-
//ры; 1 a 20);
public class Task5_28b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:  ");
        int a = scanner.nextInt();
        int resnum = 1;
        for (int i = a; i <=20 ; i++) {




            resnum = resnum * i;

            System.out.println(resnum);

        }
    }
}
