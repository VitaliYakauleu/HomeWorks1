package javaRush;

import java.util.Scanner;

//В этой задаче тебе нужно:
// 1. Ввести с клавиатуры число N.
// 2. Считать N целых чисел и заполнить ими массив array.
// 3. Найти максимальное число среди элементов массива.
public class ArrMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();


        }
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)

                max = arr[i];

        }
        System.out.println("Максимальное число в массиве: " + max);
    }
}