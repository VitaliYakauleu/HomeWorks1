package Tasks;
//5.8. Напечатать таблицу соответствия между весом в фунтах и весом в килограм-
//мах для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).
public class Tas5_8 {
    public static void main(String[] args) {
        System.out.println("фунты = килограммы");
        double pound = 0.435f;
        for (int i = 1; i <= 10; i++) {
            double kg = i *pound;
            System.out.print(i+ " = ");
            System.out.printf("%.2f%n" ,kg);

        }
    }
}
