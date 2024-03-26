package Lessons;
//В переменной n хранится вещественное число, с ненулевой дробной частью. Создайте программу, округляющую
//число n до ближайшего целого и выводящую результат
//округления на экран.
public class Task03 {
    public static void main(String[] args){
       double n = 3.2f;
       n = Math.round(n);
       System.out.println(n);

    }
}
