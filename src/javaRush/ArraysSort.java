package javaRush;

import java.util.Arrays;

//Реализуй метод main(String[]), который сортирует массив array по возрастанию.
// Для сортировки массива используй метод Arrays.sort(int[]).
public class ArraysSort {
    public static void main(String[] args) {
        int[] x = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};

        Arrays.sort(x);
        String str = Arrays.toString(x);
        System.out.println(str);

    }
}
