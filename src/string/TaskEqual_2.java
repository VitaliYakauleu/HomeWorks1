package string;

import java.util.Scanner;

//Создайте метод,
// который принимает две строки в качестве аргументов и возвращает истину,
// если длины строк совпадают, и ложь в противном случае.
public class TaskEqual_2 {
    public static void main(String[] args) {
        stringEquals();

    }
    static void stringEquals(){
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (str1.length()==str2.length()){
            System.out.println("the lines are the same length");

        }
        else
            System.out.println("the lengths of the lines are not the same");

    }
}
