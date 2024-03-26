package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//е) среднее арифметическое всех элементов массива;
public class Task11_19d {
    public static void main(String[] args) {
        Random random = new Random();


        int[] arr = new int[20];
        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,100);
            sum = sum + arr[i];



        }
        int res = sum / arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println(res);
    }
}
