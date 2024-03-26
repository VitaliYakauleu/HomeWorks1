package ifelse;

import java.util.Scanner;

//Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
// то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.
// Пример ввода: Amigo 18 Пример вывода: Amigo, явитесь в военкомат
public class Soldier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");

        String name = scanner.nextLine();

        System.out.println("Введите ваш возраст: ");

        int old = scanner.nextInt();

        if (old>=18&&old<=28)
            System.out.println(name+  ", Явитесь в военкомат ");
        else System.out.println(name+ ",гуляй, откосил и молодец, вопросов не имеем");
    }
}
