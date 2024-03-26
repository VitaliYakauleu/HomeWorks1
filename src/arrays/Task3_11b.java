package arrays;

import java.util.Random;

//б) вещественными значениями х (22<= х < 23);
public class Task3_11b {
    public static void main(String[] args) {
        Random random = new Random();

        float[] arr = new float[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextFloat(22,23);


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }


    }
}
