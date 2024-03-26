package javaRush;

import java.util.Scanner;

//Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
// Для этого необходимо использовать бесконечный цикл (while(true)).
// Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
public class Cicle8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String str = scanner.nextLine();
            System.out.println(str);
            if (str.equals("enough") ){
                break;
            }
        }
    }
}
