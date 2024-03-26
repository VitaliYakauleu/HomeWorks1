package homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Выполнить валидацию номера телефона в формате +111 (202) 555-0125
 public class HomeWork0602_T1 {
     public static void main(String[] args) {
         String phoneNumber = "+111 (202) 555-0125"; //в строку заносим номер телефона в формате из задния

         // Паттерн для проверки номера телефона
         Pattern pattern = Pattern.compile("\\+\\d{3} \\(\\d{3}\\) \\d{3}-\\d{4}");
         Matcher matcher = pattern.matcher(phoneNumber);

         if (matcher.matches()) {
             System.out.println("Номер телефона принят");
         } else {
             System.out.println("Номер телефона введен не верно");
         }
     }
 }