package arrays;
//Дан массив. Напечатать:
//а) второй, четвертый и т. д. элементы;
public class Task11_39 {
    public static void main(String[] args) {
        int[] arr = new int[]{37,1,50,46,-34,46,0,13,15,22,17,147,23};
        for (int i = 0; i < arr.length; i=i+2) {

            System.out.println(arr[i]);
        }
    }
}
