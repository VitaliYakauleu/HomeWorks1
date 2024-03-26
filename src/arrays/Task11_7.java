package arrays;

import java.util.Arrays;

//. Заполнить массив из двадцати элементов так, как представлено
//20 19 ... 1
public class Task11_7 {
    public static void main(String[] args) {
        int[] arr =new int[20];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] =  arr.length-i;

        }
        System.out.println(Arrays.toString(arr));
    }
}
