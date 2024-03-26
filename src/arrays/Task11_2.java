package arrays;
//11.2. Заполнить массив из пяти элементов значениями, вводимыми с клавиатуры
//в ходе выполнения программы.
import java.util.Scanner;

public class Task11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];


        System.out.println("Введите число 1:  ");
        arr[0] = scanner.nextInt();

        System.out.println("Введите число 2:  ");
        arr[1] = scanner.nextInt();

        System.out.println("Введите число 3:  ");
        arr[2] = scanner.nextInt();

        System.out.println("Введите число 4:  ");
        arr[3] = scanner.nextInt();

        System.out.println("Введите число 5:  ");
        arr[4] = scanner.nextInt();


        System.out.println("Значения массива:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
