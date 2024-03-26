package arrays;

import java.util.Arrays;
import java.util.Random;

//11.17. Дан массив. Все его элементы:
//а) увеличить в 2 раза;
public class Task11_17 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2,50);

            int num = arr[i];
            System.out.print(" " +num*2);
        }
        System.out.println(Arrays.toString(arr));



    }
}
