package Lessons;
//Дана точка на плоскости заданная координатами x и y,
//определить и вывести в консоль, в какой четверти находится точка, в прямоугольной (декартовой) системе координат.
//Четверти обозначены римскими цифрами.
import java.util.Scanner;

public class TaskDot {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите координату X ");
        int x = num.nextInt();
        System.out.println("Введите координату Y ");
        int y = num.nextInt();
        if ((x>=0)&&(x<=10)&&(y>=0)&&(y<=10)){
            System.out.println("Точка в четверти I");
        }
        else if ((x<=0)&&(x>=-10)&&(y>=0)&&(y<=10)) {
            System.out.println("Точка в четверти II");

        }
        else if ((x<=0)&&(x>=-10)&&(y<=0)&&(y>=-10)) {
            System.out.println("Точка в четверти III");

        }
        else if ((x>=0)&&(x<=10)&&(y<=0)&&(y>=-10)){
            System.out.println("Точка в четверти IV");
        }
        else {
            System.out.println("Точка выходит за область всех четвертей");
        }
    }
}
