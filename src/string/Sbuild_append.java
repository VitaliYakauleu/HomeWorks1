package string;
//Создайте StringBuilder и добавьте строку "Hello, " к нему. Затем добавьте строку "World!" и выведите итоговую строку.
public class Sbuild_append {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");

        String res = builder.toString();
        System.out.println(res);
    }
}
