package javaRush;
//Напишите программу, которая будет считать сумму квадратов чисел от 1 до 100.
public class Cicl5 {
    public static void main(String[] args) {
        double base = 1; // основание
        double exponent = 2; // степень
        double sum = 0;

        while (base<100){
            double res = Math.pow(base,exponent);
            base++;
            sum = sum+res;

        }
        System.out.println(sum);
    }
}
