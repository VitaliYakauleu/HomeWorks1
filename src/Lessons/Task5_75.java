package Lessons;

public class Task5_75 {
    public static void main(String[] args) {
        int num = 2;
        int pow = 10; // максимальная степень
        int sum = 0;

        for (int i = 2; i <= pow; i++) {
            sum += Math.pow(num, i); // суммируем каждую степень
        }

        System.out.println("Сумма степеней числа " + num + " от 2 до " + pow + " равна: " + sum);
    }
}