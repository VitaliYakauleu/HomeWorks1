package string;
//Напишите программу, которая сравнивает две строки и выводит сообщение о том,
// являются ли строки одинаковыми или различными.
public class TaskEqual_1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Good Bye";

        if (str1.equals(str2)) {
            System.out.println("Strings is equal");
        }
        else System.out.println("Strings is  not equal");
    }
}
