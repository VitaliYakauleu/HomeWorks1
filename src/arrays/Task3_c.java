package arrays;
//в) вещественными значениями х (0 х < 10);
import java.util.Random;

public class Task3_c {
    public static void main(String[] args) {
        Random random = new Random();

        float[] arr = new float[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextFloat(0,10);

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");

        }
    }
}
