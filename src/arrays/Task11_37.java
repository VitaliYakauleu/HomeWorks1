package arrays;
//11.37. Дан массив целых чисел. Напечатать:
//а) все четные элементы;
public class Task11_37 {
    public static void main(String[] args) {
        int[] arr = new int[]{37,1,50,46,34,46,0,13};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0)
                System.out.println("Четные числа массива: "+ arr[i]);

        }

    }
}
