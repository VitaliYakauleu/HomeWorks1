package arrays;

import java.util.Arrays;
import java.util.Random;

//) расчета среднего арифметического двух любых элементов массива.
public class Task11_15b {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2,50);


        }
        System.out.println(Arrays.toString(arr));
        int resnum = (arr[1] + arr[5]) / 2;

        System.out.println(resnum);
    }
}
