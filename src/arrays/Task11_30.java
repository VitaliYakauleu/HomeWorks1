package arrays;
//11.30. В массиве хранится информация о численности учеников в каждом из
//42 классов школы. Выяснить, верно ли, что общее число учеников в школе
//есть четырехзначное число.
public class Task11_30 {
    public static void main(String[] args) {
        int[] arr = new int[]{37,1,50,46,34,46,1110,13};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i]+sum;

        }
        if (sum>=1000 && sum<=9999)
            System.out.println("Четырехзначное");
        else System.out.println("В числе другое количество цифр");
    }
}
