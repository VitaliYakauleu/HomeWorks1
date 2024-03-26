package arrays;

import java.util.Arrays;

//11.9. Заполнить массив:
//а) десятью первыми членами арифметической прогрессии с известным первым членом прогрессии а и ее разностью р;
public class Task11_9a {
    public static void main(String[] args) {
        int[]arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1+i*3;

        }
        System.out.println(Arrays.toString(arr));
    }
}
