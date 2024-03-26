package arrays;

import java.util.Random;

//11.4. Массив предназначен для хранения значений ростов двенадцати человек.
//С помощью датчика случайных чисел заполнить массив целыми значениями,
//лежащими в диапазоне от 163 до 190 включительно.
public class Task11_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(163, 191-1);


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("рост человека "+ (i+1) + "  " +arr[i] + "  ");

        }

    }
}
