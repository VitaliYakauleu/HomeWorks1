package Tasks;

import java.util.Scanner;

//г) произведение всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b > a).
public class Tas5_28d {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter num A  ");
        int a = scanner.nextInt();
        System.out.println("Enter num B  ");
        int b = scanner.nextInt();
        int res = 1;
        for (int i = a; i <=b ; i++) {

            res = res * i;
            System.out.println(res);

        }
    }
}
