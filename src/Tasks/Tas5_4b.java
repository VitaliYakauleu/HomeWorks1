package Tasks;
//25 25.5 24.8
//35 35.5 34.8
public class Tas5_4b {
    public static void main(String[] args) {
        for (int i = 25; i <=35 ; i++) {
            System.out.print(i+ " ");
            System.out.printf("%.1f ", i + 0.5);
            System.out.printf("%.1f%n", i - 0.2);
            
        }
    }
    
}
