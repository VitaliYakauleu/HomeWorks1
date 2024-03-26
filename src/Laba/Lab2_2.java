package Laba;

public class Lab2_2 {
    public static void main(String[] args) {
        double x = 0.5; //задаем значение х
        int iter = 10; //10 итерайий
        double res = 0; // сумма чисел ряда
        int sign = 1;
        for (int i = 1; i <=iter ; i++) {
            double term = Math.pow(x*(2+x), 2*i) / factorial(2*i);
            res += sign * term;
            sign *= -1;

        }
        System.out.println("Сумма ряда: " + res);
    }
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
