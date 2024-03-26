package Tasks;
import java.text.DecimalFormat;
//5.7. Одна штука некоторого товара стоит 20,4 руб. Напечатать таблицу стоимости
//2, 3, ..., 20 штук этого товара.
public class Task5_7 {
    public static void main(String[] args) {
        double price = 20.4f;

        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 1; i <=20; i++) {
           double result =i*price;

            System.out.println(df.format(result));

        }

    }
}
