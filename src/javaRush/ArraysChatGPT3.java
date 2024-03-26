package javaRush;
//Дан двумерный массив, в котором хранятся оценки студентов за различные предметы.
// Необходимо вычислить средний балл каждого студента и вывести их на экран.
//Пример входного двумерного массива:
//int[][] grades = {
//    {70, 85, 90, 75},
//    {65, 80, 75, 70},
//    {95, 90, 85, 100},
//    {80, 75, 70, 65}
//};
//Ожидаемый вывод:
//Средний балл студента 1: 80.0
//Средний балл студента 2: 72.5
//Средний балл студента 3: 92.5
//Средний балл студента 4: 72.5

// for (int i = 0; i < grades.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < grades[i].length; j++) {
//                sum += grades[i][j];
//            }
public class ArraysChatGPT3 {
    public static void main(String[] args) {
        int[][] grades = {{70, 85, 90, 75}, {65, 80, 75, 70}, {95, 90, 85, 100}, {80, 75, 70, 65}};

        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            double average = (double)sum / grades[i].length;
            System.out.println("Средний балл студента " + (i+1) + ": " + average);
        }
    }
}
