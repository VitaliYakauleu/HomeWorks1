package javaRush;

import java.util.Scanner;

//Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
// Выведи на экран максимальное четное число из введенных.
// Если введено несколько таких чисел, необходимо вывести любое из них.
public class Cicle11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (scanner.hasNextInt()){
            int x=scanner.nextInt();
            if(x>max&&x%2==0)
                 max = x;
        }
        System.out.println(max);
    }
}
