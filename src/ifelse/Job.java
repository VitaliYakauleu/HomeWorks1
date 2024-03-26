package ifelse;

import java.util.Scanner;

//Напишем программу, которая будет считывать с клавиатуры возраст. Если возраст от 20 до 60 (включительно),
// то выводить ничего не нужно, иначе - вывести фразу "можно не работать".
// Сделать это можно (и нужно!) с помощью только одного оператора if без else.
// Подсказка : используй логический оператор "||"
public class Job {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you");
        int age = scanner.nextInt();

        if (age<=19 || age>=61)
            System.out.println("you don't have to work");
    }
}
/*int age = 35;
boolean isYoung = (age < 18);
boolean isOld = (age > 65);
if (!isYoung && !isOld)
   System.out.println("Вы можете работать");  возможен такой вариант решения!!! */