package javaRush;

import java.util.Arrays;

//У вас есть двумерный массив размером 3x3,
// в который записаны целые числа.
// Необходимо найти сумму элементов в каждой строке и вывести результаты на экран.
//Пример массива:
//1 2 3
//4 5 6
//7 8 9
//Ваша задача - создать программу на языке Java,
// которая найдет сумму элементов в каждой строке этого массива и выведет результаты на экран.
public class ArraysChatGPT {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int count = 1;

        // Заполняем массив значениями от 1 до 9
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count;
                count++;
            }
        }

        // Выводим массив в консоль
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();


        }
        int sum = 0;

        for (int i = 0; i < array[0].length; i++) {
            sum += array[0][i];
        }
        int sum2 = 0;

        for (int i = 0; i < array[0].length; i++) {
            sum2 += array[1][i];
        }
        int sum3 = 0;

        for (int i = 0; i < array[0].length; i++) {
            sum3 += array[2][i];
        }
        System.out.println("сумма чесел строки 1: " + sum );
        System.out.println("сумма чесел строки 2: " + sum2 );
        System.out.println("сумма чесел строки 3: " + sum3 );
    }
}
