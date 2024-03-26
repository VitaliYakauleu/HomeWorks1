package Lessons;

import java.util.Scanner;

//Задание 2
//С клавиатуры вводится время (количество часов от 0 до
//24) – программа выводит приветствие, соответствующее
//введенному времени (например, ввели 15 часов – выводится
//приветствие «Добрый день»).

public class TaskTime {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Который час? ...");
        int time = Scanner.nextInt();

        if (time >= 0 && time <= 5) {
            System.out.println("Доброй ночи, ложись спать завтра на работу");
        }
        else if  (time >= 6 && time <= 10) {
            System.out.println("Утро доброе, хорошего дня");
        }
        else if (time >= 11 && time <= 17) {
            System.out.println("Добрый день!!!");
        }
        else if (time >= 18 && time <= 24) {
            System.out.println("Добрый вечер");



        }
        else {
            System.out.println("Попробуй ввести правильное время");
        }

    }
}
