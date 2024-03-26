package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//д) сумму элементов массива с k1-го по k2-й (значения k1 и k2 вводятся
//с клавиатуры; k2 > k1);
public class Task11_19c {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,100);


        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Введите 1 число ячейки массива:  ");
        int a = scanner.nextInt();

        System.out.println("Введите 2 число ячейки массива:  ");
        int b = scanner.nextInt();


        int sum = arr[a] + arr[b];

        System.out.println(sum);



    }
}
