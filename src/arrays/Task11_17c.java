package arrays;
//Дан массив. Все его элементы:



//в) разделить на первый элемент.
public class Task11_17c {

        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50}; // пример массива целых чисел
            int firstElement = array[0]; // сохраняем значение первого элемента
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] / firstElement; // делим каждый элемент на первый элемент
            }
            // Выводим результат
            for (int value : array) {
                System.out.println(value);
            }
        }
    }