package javaRush;

import java.util.Scanner;

//Считай с клавиатуры три строки. А затем: 1. Выведи на экран третью строку в неизменном виде.
// 2. Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
// 3. Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру. Пример ввода: Строка Номер РАЗ Втор
public class Str3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите РАЗ");
        String a = scanner.nextLine();
        System.out.println("Введите два");
        String b = scanner.nextLine();
        System.out.println("Введите три");
        String c = scanner.nextLine();

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(c.toLowerCase());
    }
}
