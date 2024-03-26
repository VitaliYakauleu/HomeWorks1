package javaRush;
//Напишите метод, который принимает на вход двумерный
// массив целых чисел и возвращает сумму элементов на главной
// диагонали (элементы с одинаковыми индексами i и j, где i = j).
public class MetodCGPT4 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(returnDiagonalSum(arr));
    }

    public static void retunArrSum() {
        int[][] arr = new int[7][7];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count;
                count++;

            }
        }
    }
    public static int returnDiagonalSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}