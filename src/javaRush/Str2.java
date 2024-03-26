package javaRush;
//В переменную hugeAmount нужно записать число 100500.
// Используй переменные bigAmount, greatAmount и преобразование строки в число.
// Для объявления и инициализации hugeAmount используй одну команду.
public class Str2 {
    public static void main(String[] args) {
        String bigAmount = "100";
        String greatAmount = "500";
        int hugeAmount = Integer.parseInt(bigAmount + greatAmount);
        System.out.println(hugeAmount);
    }
}
