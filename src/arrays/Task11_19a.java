package arrays;
// Определить:
//а) сумму всех элементов массива;
public class Task11_19a {
    public static void main(String[] args) {
        int[] arr = {5, 9, 14, 5, 12};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);


    }
}
