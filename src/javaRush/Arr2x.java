package javaRush;

import java.util.Arrays;

//Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
// заполни его таблицей умножения и выведи в консоли в следующем виде: 1 2 3 4 … 2 4 6 8 … 3 6 9 12 … 4 8 12 16 … …
// Числа в строке разделены пробелом.
public class Arr2x {
    public static void main(String[] args) {
        int[][] multTable = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multTable[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               // System.out.print(multTable[i][j] + " ");
            }

        }
        System.out.print(Arrays.deepToString(multTable));
    }
}