package arrays;
//11.36. Дан массив. Напечатать:
//а) все неотрицательные элементы;
public class Task11_36 {
    public static void main(String[] args) {
        int[] arr = new int[]{37,1,50,46,-34,46,0,13};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) System.out.println(arr[i]);
        }

    }
}
