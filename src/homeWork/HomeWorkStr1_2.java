package homeWork;

// homeWork.HomeWorkStr1_2
public class HomeWorkStr1_2  {
    public static void main(String[] args) {
        String sourceWord = "программа";

        //String sub1 = sourceWord.substring(1, 6); // "рограм" // просто пртестировать
        String sub2 = sourceWord.substring(3, 8); // "грамм"

        String sub3 = sourceWord.substring(7,8);//м
        String sub4 = sourceWord.substring(4,7);//рам
        String sub5 = sourceWord.substring(2,3);//о
        String sub6 = sourceWord.substring(1,2);//p


        String newWord1 = sub3 + sub4 + sub5 + sub6; // "мрамор"
        String newWord2 = sub2; // "грамм"

        System.out.println(newWord1);
        System.out.println(newWord2);
    }
}
