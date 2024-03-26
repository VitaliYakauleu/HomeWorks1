package javaRush;
//Проверка на четность:
//Напишите метод, который принимает целое число и возвращает true, если число четное, и false, если нечетное.
// Вызовите этот метод для нескольких чисел и выведите результаты на экран.
public class MetodCGPT5 {
    public static void main(String[] args) {
        returnNum(2);
        returnNum(3);
        returnNum(99);
        returnNum(33);

    }
    public static void returnNum(int num){


        if (num%2==0) {
            System.out.println(true);

        }else System.out.println(false);
    }
}
