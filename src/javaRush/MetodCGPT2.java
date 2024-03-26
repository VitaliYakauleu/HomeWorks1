package javaRush;

import java.util.Scanner;

//Напишите метод, который принимает на вход строку и возвращает её длину.
public class MetodCGPT2 {
    public static void main(String[] args) {
        returnStr();

    }
    public static void returnStr(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int lenght = str.length();
        System.out.println("Длинна строки: "+ lenght + "символов.");
    }
}
