package arrays;

import java.util.Random;

//д) целыми значениями, лежащими в диапазоне от 0 до 10 включительно.
public class Task11_3e {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,10+1);

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "   ");

        }
    }
}
