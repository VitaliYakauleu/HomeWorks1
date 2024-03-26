package arrays;

import java.util.Arrays;
import java.util.Random;

//11.16. Дан массив целых чисел. Выяснить:
//а) является ли s-й элемент массива положительным числом;
public class Task1_16 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int a = arr[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-100,100);


        }
        System.out.println(Arrays.toString(arr));
        if (arr[a]>0){
            System.out.println("4islo polozitelnot");
        }else{
            System.out.println("чило отрицацельное");
        }
    }
}
