package arrays;

import java.util.Arrays;
import java.util.Random;

//11.26. В массиве хранятся сведения о количестве осадков, выпавших за каждый
//день февраля. Определить среднедневное количество осадков в этом месяце.
public class Task11_26 {
    public static void main(String[] args) {
        int[] arr = new int[28];
        float sum = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15,45);


        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum = (arr[i]+sum) / arr.length;


        }
        System.out.println("среднедневное количество осадков в этом месяце  : "+sum + "mm");
    }
}
