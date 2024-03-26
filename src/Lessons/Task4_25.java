package Lessons;
//4.25. Дано двузначное число. Определить:
//а) является ли сумма его цифр двузначным числом;
//б) больше ли числа а сумма его цифр.
public class Task4_25 {
    public static void main(String[] args) {

        int number = 37;
        int number1 = (number / 10);
        int number2 = (number % 10);
        int sumOfNum = (number1 + number2);


        if (sumOfNum>=10 || sumOfNum<=99 ) {
            System.out.println("Число является двузначным");
// можно конечно было чуток упростить, но понял это когда уже написал так!!! это касаемо варианта "б"
        }
        int  a =22;
        int b1 = (a / 10);
        int b2 = (a % 10);
        int c = (b1 + b2);
        float b = (a % c);
        if (b>1){
            System.out.println("Число 'а' больше суммы его цифр");
        }
    }
}
