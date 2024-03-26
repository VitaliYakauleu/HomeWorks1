package Programm_for_me;

import java.util.Scanner;

// как вы рекомендовали я попробую исполнить программу для расчета зарплаты продавцу
// тут  использовал тип данных double потому что вещественное
//
public class Payday {
    public static void main (String [] args ) {
        Scanner num = new Scanner(System.in);
        System.out.println("Сколько дней ты работала?     ");
        int days = num.nextInt();
        double payday = (days * 11 * 4.5);
        System.out.println("ты получишь\n "+payday + " рублей");
    }
}
