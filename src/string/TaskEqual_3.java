package string;
//Напишите программу, которая сравнивает две строки без учета регистра символов.
// Программа должна выводить сообщение о том,
// являются ли строки одинаковыми или различными при игнорировании регистра символов.
public class TaskEqual_3 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "HELLo";

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings is equal");
        }
        else System.out.println("Strings is  not equal");
    }
}
