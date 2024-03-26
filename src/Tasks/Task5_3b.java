package Tasks;

import java.util.Scanner;

//Напечатать "столбиком":
//б) квадраты всех целых чисел от 10 до b (значение b вводится с клавиатуры;
public class Task5_3b {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите цифру    ");
        int b = num.nextInt();
        for (int i = 10; i <=b; i++) {
            int quad = i*i;
            System.out.println(quad);
            
        }
    }
}
