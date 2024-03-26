package arrays;

import java.util.Random;

//. Заполнить массив из пятнадцати элементов случайным образом:
//а) вещественными значениями, лежащими в диапазоне от 0 до 1;
public class Task11_3a {
    public static void main(String[] args) {
        Random random = new Random();

        float[] arr = new float[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextFloat(1);

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }


    }
}
