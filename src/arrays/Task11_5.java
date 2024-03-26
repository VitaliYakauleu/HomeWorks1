package arrays;

import java.util.Random;

//11.5. Массив предназначен для хранения значений весов двадцати человек.
//С помощью датчика случайных чисел заполнить массив целыми значениями,
//лежащими в диапазоне от 50 до 100 включительно.
public class Task11_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50,101-1);


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
