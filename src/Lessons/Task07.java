package Lessons;
//Разработать программу, которая позволит при известном
//годовом проценте вычислить сумму вклада в банке через
//два года, если задана исходная величина вклада.
//%=P*R*T/100
public class Task07 {
    public static void main(String[] args) {
        int contribution = 10000;
        int percent = 7;
        int age = 2;
        double totalSum = contribution * percent * age / 100;
        double extradition = totalSum + contribution;
        System.out.println(" сумма вклада через 2 года " + totalSum );
        System.out.println("сумма к выдаче по истечении двух лет " + extradition);
    }
}
