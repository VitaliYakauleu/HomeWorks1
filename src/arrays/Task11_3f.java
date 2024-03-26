package arrays;

import java.util.Random;

//г) вещественными значениями х (–50 х < 50);
public class Task11_3f {
    public static void main(String[] args) {


        Random random = new Random();
        int[] arr = new int [15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-50,50);


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
