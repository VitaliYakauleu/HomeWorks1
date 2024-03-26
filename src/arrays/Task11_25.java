package arrays;

import java.util.Arrays;
import java.util.Random;

//11.25. В массиве хранятся сведения о количестве осадков, выпавших за каждый
//день июня. Определить общее количество осадков, выпавших за каждую
//декаду этого месяца.
public class Task11_25 {
    public static void main(String[] args) {
        int[] arr = new int[29];
        int dec1 = 0;
        int dec2 = 0;
        int dec3 = 0;


        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5,50);




        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <=9 ; i++) {


            dec1 = dec1 + arr[i];

        }
        System.out.println(dec1);
        for (int i = 10; i <=19 ; i++) {

            dec2 = dec2 + arr[i];

        }
        System.out.println(dec2);
        for (int i = 20; i <29 ; i++) {

            dec3 = dec3+arr[i];

        }
        System.out.println(dec3);
    }
}
