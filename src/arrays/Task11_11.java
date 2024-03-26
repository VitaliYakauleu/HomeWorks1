package arrays;
import java.util.Random;

public class Task11_11 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(100); // Генерируем случайное число от 0 до 99
            while (contains(array, randomNumber)) { // Проверяем, содержит ли массив уже сгенерированное число
                randomNumber = random.nextInt(100); // Если содержит, генерируем новое число
            }
            array[i] = randomNumber; // Заполняем массив неповторяющимися числами
        }

        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    // Метод для проверки наличия элемента в массиве
    public static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}