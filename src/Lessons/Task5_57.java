package Lessons;
import java.util.Arrays;
//5.57. Известны оценки двух учеников по четырем предметам. Определить сумму
//оценок каждого ученика. Т.к. массивы мы уже проходили будем использовать их.
public class Task5_57 {



        public static void main(String[] args) {
            // Оценки первого ученика
            int[] gradesIvanov = {5, 4, 2, 4};

            // Оценки второго ученика
            int[] gradesPetrov = {4, 5, 5, 4};

            int sumgradesIvanov = Arrays.stream(gradesIvanov).sum();

            int sumgradesPetrov = Arrays.stream(gradesPetrov).sum();

            System.out.println("Сумма оценок Иванова ученика: " + sumgradesIvanov);
            System.out.println("Сумма оценок Петрова ученика: " + sumgradesPetrov);
        }
    }

