package Tasks;
//5.17. Рассчитать значения y для значений х, равных 4, 5, ..., 28:
//y
//2t2
//5,5t
//2,
//t
//x
//2
public class Tas5_17 {
    public static void main(String[] args) {

        for (int i = 4; i <=28 ; i++) {
            double x = i;
            double t =x + 2;
            double y = (2*(t*t))+(5.5f*t)-2;
            System.out.println(y);


        }
    }
}
