package arrays;

import java.util.Arrays;
import java.util.Random;

//Дан массив. Составить программу:
//а) расчета квадратного корня из любого элемента массива;
public class Task11_15a {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2,50);


        }
        System.out.println(Arrays.toString(arr));
        int sq = (int) Math.sqrt(arr[1]);
        System.out.println("квадратный корень из  " +arr[1] +"  равен : "+ sq);
    }


}
