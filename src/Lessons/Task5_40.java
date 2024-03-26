package Lessons;

public class Task5_40 {

        public static void main(String[] args) {
            int n = 10;
            double[] numbers = {1.5, 2.7, 3.2, 4.8, 5.1, 6.4, 7.9, 8.2, 9.6, 10.3};
            // Здесь задали значение вещ. чисел(какие придумались)

            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                sum += numbers[i];
            }

            System.out.println("Сумма всех вещественных чисел: " + sum);
        }
    }