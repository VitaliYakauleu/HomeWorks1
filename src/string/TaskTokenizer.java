package string;
//Напишите программу, которая считает сумму всех чисел в строке,
// разделенных запятыми, с использованием класса StringTokenizer.
//Пример ввода: "10,20,30,40"
//
//Ожидаемый вывод: Сумма чисел: 100

import java.util.StringTokenizer;

public class TaskTokenizer {
    public static void main(String[] args) {
        String str = "10,20,30,40";
        StringTokenizer tokenizer = new StringTokenizer(str, ",");

        // Переменная для хранения суммы
        int sum = 0;

        // Пока есть элементы в StringTokenizer
        while (tokenizer.hasMoreTokens()) {
            // Преобразуем элемент в число и добавляем к сумме
            sum += Integer.parseInt(tokenizer.nextToken());
        }

        System.out.println("Сумма чисел: " + sum);
    }


}
