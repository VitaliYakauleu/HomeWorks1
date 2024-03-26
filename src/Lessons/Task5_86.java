package Lessons;
import java.util.Scanner;

public class Task5_86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = input.nextInt();

        int square = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                square = i * i;
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    square = j * j;
                }
            }
        }
        System.out.println(square);
    }
}