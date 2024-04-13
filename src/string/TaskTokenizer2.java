package string;

import java.util.StringTokenizer;

//Напишите программу, которая разбивает строку на слова и выводит их количество с использованием класса StringTokenizer.
//Пример ввода: "Это простой пример строки"
//
//Ожидаемый вывод: Количество слов: 4
public class TaskTokenizer2 {
    public static void main(String[] args) {
        String str ="Это простой пример строки";
        StringTokenizer token = new StringTokenizer(str);

        int count = token.countTokens();
        System.out.println("Количество слов: "+ count);
    }
}
