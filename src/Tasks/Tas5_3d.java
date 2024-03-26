package Tasks;
//эту задачу написал полностью сам, иногда подглядывая в свои старые коды... процесс идет
import java.util.Scanner;

//все целые числа от a до b (значения a и b вводятся с клавиатуры; b a).
public class Tas5_3d {
    public static void main(String[] args) {
    Scanner num = new Scanner(System.in); //тут запускаем ввод данных с клавы
        System.out.println("Введите цифру1    ");
        int a = num.nextInt();
        Scanner num2 = new Scanner(System.in);

    System.out.println("Введите цифру2    ");
    int b = num.nextInt();
        if (a>b){ //тут подстраховываемся чтобы ввод был корректный
            System.out.println("Введите число чтобы первое было больше второго");
        }
    for (int i = a ; i <=b; i++) { //тут записываем условие в цикле

        System.out.println(i);


    }
}
}
