package arrays;
//Дан массив целых чисел. Выяснить:
//а) верно ли, что сумма элементов массива есть четное число;
public class Task11_29a {
    public static void main(String[] args) {
        int[] arr = new int[]{37,1,50,46,34,46,0,13};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i]+sum;

        }
        System.out.println(sum);
        if (sum % 2 == 0)
            System.out.println("Число четное");
        else System.out.println("Число нечетное");
    }
}
