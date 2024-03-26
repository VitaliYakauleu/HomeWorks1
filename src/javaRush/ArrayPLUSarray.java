package javaRush;
//Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов firstArray и secondArray в
// один массив resultArray.
// Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
import java.util.Arrays;

public class ArrayPLUSarray {
    public static void main(String[] args) {
        int[] arr1=new int[5];
        for (int i = 0; i < arr1.length ; i++) {
arr1[i]= arr1.length;
            System.out.println(Arrays.toString(arr1));
        }
        int[] arr2= new int[4];
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i]= arr2.length;
            System.out.println(Arrays.toString(arr2));
        }


        int[]arrRes = new int [arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arrRes, 0, arr1.length);
        System.arraycopy(arr2, 0, arrRes, arr1.length, arr2.length);
        //копирует инфо из двух массивов и объеденяет их в один
        System.out.println(Arrays.toString(arrRes));
    }
}
