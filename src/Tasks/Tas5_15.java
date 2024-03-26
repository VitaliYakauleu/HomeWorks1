package Tasks;

import java.util.Scanner;

//5.15. Напечатать таблицу умножения на число n (значение n вводится с клавиату-
//ры; 1 n 9).
public class Tas5_15 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите цифру    ");
        int a = num.nextInt();
        for (int i = 1; i <=9 ; i++) {
            int res = i * a;
            System.out.println( i+ " * " +a +" = " +res );

        }
    }

}
