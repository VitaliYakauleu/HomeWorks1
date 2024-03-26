package Tasks;
//5.10. Напечатать таблицу перевода 1, 2, ... 20 долларов США в рубли по текущему
//курсу (значение курса вводится с клавиатуры).
//
public class Tas5_10 {
    public static void main(String[] args) {
        double rate = 3.21;
        System.out.println("Расчет");
        for (int i = 1; i <=20 ; i++) {
            double byn = i * rate;
            System.out.print(i+ " = ");
            System.out.printf("%.2f%n", byn );// не смог добавить слово "бел рубля" в строку

//на решение ушло 3 минуты
        }

    }
}
