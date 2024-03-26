package javaRush;

import java.util.Scanner;

//Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
// например, строка или символ. Выведи на экран минимальное число из введенных.
// Если введено несколько таких чисел, необходимо вывести любое из них.
public class Cicle10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int min = Integer.MAX_VALUE;
        while (scanner.hasNextInt()){
            int a = scanner.nextInt();

             if (a<min)
                 min = a;
        }
        System.out.println(min);
    }
}
