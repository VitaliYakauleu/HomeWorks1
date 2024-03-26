package Tasks;
//Напечатать таблицу перевода расстояний в дюймах в сантиметры для значе-
//ний 10, 11, ..., 22 дюйма (1 дюйм = 25,4 мм).
public class Tas5_9 {
    public static void main(String[] args) {
        System.out.println("дюймы  сантиметры");
        double inch = 25.4 / 10;
        for (int i = 10; i <=22 ; i++) {
            double santim = i * inch;
            System.out.print(i+" = ");
            System.out.printf("%.2f%n", santim);


        }

    }
}
