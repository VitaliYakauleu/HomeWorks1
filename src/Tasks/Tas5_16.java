package Tasks;
//5.16. Напечатать "столбиком" значения sin 2 , sin3 , ..., sin 20 .
public class Tas5_16 {
    public static void main(String[] args) {

        for (int i = 2; i <=20 ; i++) {
            double sin = Math.sin(i);
            System.out.println(sin);

        }

    }
}
