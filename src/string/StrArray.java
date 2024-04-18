package string;
// Напишите метод, который принимает на вход массив строк
// и объединяет их в одну строку с помощью StringBuilder,
// разделяя каждую строку пробелом.
public class StrArray {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange"};
        System.out.println(concatenateStrings(fruits));



    }
    public static String concatenateStrings(String[] strings) {
        StringBuilder sb = new StringBuilder();

        for (String str : strings) {
            sb.append(str).append(" ");
        }

        return sb.toString().trim();
    }
}
