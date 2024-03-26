package arrays;
//11.28. Выяснить, верно ли, что сумма элементов массива есть неотрицательное
//число.
public class Task11_28 {
    public static void main(String[] args) {
        int[] arr = {4, -24, -12, 5, 2};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        if (sum>=0){
            System.out.println("сумма элементов положительная");
        }else {
            System.out.println("сумма отрицательная");
        }

    }
}
