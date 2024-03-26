package arrays;

import java.util.Arrays;

//11.6. Заполнить массив из двенадцати элементов так, как показано
//1 2 ... 12
public class Task11_6 {
    public static void main(String[] args) {
        float[] arr = new float[12];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;


        }
        System.out.println(Arrays.toString(arr));

    }
}
