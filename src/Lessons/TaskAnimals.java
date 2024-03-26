package Lessons;
//Написать программу, которая предлагает пользователю
//выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в
//ответ показывает, какие звуки издает выбранное животное.
//В списке должно быть не менее 10 животных.

import java.util.Scanner;

public class TaskAnimals {
    public static void main(String[] args) {
        System.out.println("Выберите животное из списка и я скажу вам как оно разговаривает, выберите номер животного:  \n 1-Кот  \n 2-Собака  \n 3-Коза  \n 4-Корова  \n 5-Осел  \n 6-Конь  \n 7-Тигр  \n 8-Змея  \n 9-Ежик  \n 10-Рыбы))");
        Scanner Scanner = new Scanner(System.in);
        int animal = Scanner.nextInt();
        switch (animal) {
            case 1:
                System.out.println("МЯЯЯЯЯУУУ");
                break;
            case 2:
                System.out.println("Гав Гав");
                break;
            case 3:
                System.out.println("БЭЭЭЭЭЭЭЭЭ");
                break;
            case 4:
                System.out.println("Мууууу");
                break;
            case 5:
                System.out.println("иа иа иа");
                break;
            case 6:
                System.out.println("Иго го");
                break;
            case 7:
                System.out.println("РРРРРРР");
                break;
            case 8:
                System.out.println("шшшшшшшшш");
                break;
            case 9:
                System.out.println("фыр фыр");
                break;
            case 10:
                System.out.println("Она молчит, потому что знает что молчание - Золото)))");
                break;
            default:
        }
    }
}
