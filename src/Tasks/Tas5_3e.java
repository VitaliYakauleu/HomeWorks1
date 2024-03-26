package Tasks;

import java.util.Scanner;

//г) все целые числа от a до b (значения a и b вводятся с клавиатуры; b a).
public class Tas5_3e {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите цифру 1: ");
        int a = num.nextInt();
        System.out.println("Введите цифру 2: ");
        int b = num.nextInt();

        for (int i = a; i <=b ; i++) {
            System.out.println(i);


        }
    }
}
