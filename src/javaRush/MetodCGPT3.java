package javaRush;
//Напишите метод, который принимает на вход массив чисел и возвращает сумму всех элементов массива.
public class MetodCGPT3 {
    public static void main(String[] args) {
        printArrayValues();
    }
    public static void printArrayValues() {
        int [] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }
}
