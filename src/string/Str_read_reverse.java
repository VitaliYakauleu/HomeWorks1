package string;
//Создайте метод, который принимает на вход строку и возвращает ее в обратном порядке, используя StringBuilder.
import java.util.Scanner;

public class Str_read_reverse {
    public static void main(String[] args) {
        Str_read_reverse str1 = new Str_read_reverse();
        str1.reverseStr();


    }
    public void reverseStr(){
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        StringBuilder res = new StringBuilder(str);

        res.reverse();
        System.out.println(res);


    }
}
