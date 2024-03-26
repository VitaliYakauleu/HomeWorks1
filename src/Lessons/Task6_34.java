package Lessons;
public class Task6_34 {
    public static void main(String[] args) {
        int count = 0; // счетчик
        int currentNumber = 100; // начальное значение Левая граница

        while (count < 15) {
            if (currentNumber % 19 == 0) {
                System.out.println(currentNumber);
                count++;
            }
            currentNumber++;
        }
    }
}