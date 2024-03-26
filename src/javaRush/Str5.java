package javaRush;

import java.util.Scanner;
//сравнение строк ,оченьхороший пример
public class Str5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();
        String result = a.equals(b) ? "Одинаковые" : "Разные";
        System.out.println(result);
    }
}
