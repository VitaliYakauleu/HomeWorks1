package javaRush;
//Используя вложенные циклы while (цикл в цикле)
// выведи на экран прямоугольник размером 5 (высота) на 10 (ширина),
// заполненный буквой 'Q'.
public class Cicle7 {
    public static void main(String[] args) {
        int a =0;


        while (a<5){

            a++;
            int b =0;

            while (b<10){
                System.out.print("Q");

                b++;
            }
            System.out.println();
        }
    }
}
