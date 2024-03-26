package javaRush;
//У вас есть двумерный массив, представляющий таблицу оценок студентов.
// Каждая строка представляет оценки одного студента, а каждый столбец - оценки по разным предметам.
// Напишите программу на Java, которая посчитает средний балл каждого студента и выведет его на экран.
//
//Пример входного массива:
//int[][] grades = {
//{75, 80, 85},
//{60, 70, 65},
//{90, 95, 85}
//};
//
//Ожидаемый вывод:
//Средний балл студента 1: 80.0
//Средний балл студента 2: 65.0
//Средний балл студента 3: 90.0
public class ArraysChatGPT2 {
    public static void main(String[] args) {
        int[][] grades = {{75, 80, 85}, {60, 70, 65}, {90, 95, 85}};

        int avrGreade1 = 0;
        int avrGreade2 = 0;
        int avrGreade3 = 0;
        for (int i = 0; i < grades[0].length; i++) {
            avrGreade1=(avrGreade1+grades[0][i]);
            avrGreade2=(avrGreade2+grades[1][i]);
            avrGreade3=(avrGreade3+grades[2][i]);

        }
        System.out.println("Средний балл студента 1: " + avrGreade1/grades[0].length+ "\nСредний балл студента 1:: " + avrGreade2/grades[0].length + "\nСредний балл студента 1: " + avrGreade3/grades[0].length);




    }
}
