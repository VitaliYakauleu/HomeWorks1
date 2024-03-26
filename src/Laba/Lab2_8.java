package Laba;

public class Lab2_8 {
    public static void main(String[] args) {
        double x = 0.5;  // Значение x
        int iter = 10;  // Количество итераций

        double result = 0;  // тут хранится результат суммы ряда
        int sign = 1; // служит для смены знака при каждом новом слагаемом
        for (int i = 1; i <= iter; i++) {   //в цикле понятно, прописываем 10 итераций
            double term = Math.pow(2*x, 2*i) / factorial(2*i);
            result += sign * term;
            sign *= -1;
        }

        System.out.println("Сумма ряда: " + result);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}