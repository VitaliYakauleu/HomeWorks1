package Lessons;
import java.util.Scanner;
//Определить, в какую из областей — I или II (рис. 4.1) — попадает точка с за-
//данными координатами. Для простоты принять, что точка не попадает на гра-
//ницу областей.
public class Task4_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите координату X  ");
        int x = num.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Введите координату Y  ");
        int y = num.nextInt();

        if ((y>=0) || (y<=0) && (x<4))
            System.out.println("При данных координатах точка будет находится в области 1 ");
        else System.out.println("При данных координатах точка будет находится в области 2  ");








    }

}
