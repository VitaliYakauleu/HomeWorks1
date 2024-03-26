package Tasks;
//Напечатать числа следующим образом:
//а)
//10 10.4
//б)
//25 25.5 24.8
//11 11.4
//26 26.5 25.8
//...
//...
//25 25.4
//35 35.5 34.8
public class Tas5_4a {
    public static void main(String[] args) {
        // Вариант а)

        for (int i = 10; i <= 25; i++) {
            System.out.print(i + "  ");
            System.out.printf("%.1f%n", i + 0.4);
        }
    }
}