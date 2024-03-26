package javaRush;
//В этой задаче тебе предстоит реализовать метод generateNumber(),
// который будет возвращать случайное число от 0 до 99.
// В методе generateNumber() используй метод Math.random().
public class Task9_2_1 {
    public static void main(String[] args) {

            System.out.println(generateNumber());



    }
    public static int generateNumber(){


        return (int) (Math.random() * 100) ;
    }
}
