package arrays;

import java.util.Arrays;
import java.util.Random;

//11.32. В массиве хранится информация о массе каждого из 50 предметов, загружаемых в грузовой автомобиль,
// грузоподъемность которого известна. Определить, не превышает ли общая масса всех предметов грузоподъемность
//автомобиля.
public class Task11_32 {
    public static void main(String[] args) {
        Random random = new Random();
        int maxWeight = 3500;
        int[] arr = new int[50];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(35,100);

        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];


        }
        System.out.println(sum);
        if(sum<maxWeight)
            System.out.println("масса груза не превышает мксимум, можно ехать");
        else System.out.println("перегруз");


    }
}
