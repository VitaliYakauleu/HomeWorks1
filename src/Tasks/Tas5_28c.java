package Tasks;

import java.util.Scanner;

//в) произведение всех целых чисел от 1 до b (значение b вводится с клавиатуры; 1 b 20);
public class Tas5_28c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число  ");
        int b = scanner.nextInt();

        int res = 1;

        for (int i = 0; i <=b; i++) {
            res = res * b;
            System.out.println(res);

        }

    }
}
