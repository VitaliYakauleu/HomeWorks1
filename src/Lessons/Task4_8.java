package Lessons;
//Известны два расстояния:
//одно в километрах,другое—
//в футах(1 фут=0,305 м). Какое из расстояний меньше?
import java.util.Scanner;
public class Task4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Расстояние 1 в киломерах    ");
        double km = scanner.nextDouble();


        System.out.println("Расстояние 2 в футах    ");
        double foot = scanner.nextDouble();


        if (km * 1000 < foot * 0.305) {
            System.out.println("Рассттояние в километрах меньше ");

        }
        if  (km * 1000 > foot * 0.305) {
            System.out.println("Расстояние в футах меньше ");
        }




    }
}
