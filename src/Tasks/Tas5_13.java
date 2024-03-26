package Tasks;
//Напечатать таблицу умножения на 7:
public class Tas5_13 {
    public static void main(String[] args) {
        int num =7;
        for (int i = 1; i <=9 ; i++) {

            int resnum = i * num;
            System.out.println(i + " * " +num+ " = " +resnum);

        }
    }
}
