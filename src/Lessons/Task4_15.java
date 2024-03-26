package Lessons;
//4.15. Известны год и номер месяца рождения человека, а также год и номер месяца
//сегодняшнего дня (январь — 1 и т. д.). Определить возраст человека (число
//полных лет). В случае совпадения указанных номеров месяцев считать, что
//прошел полный год.
public class Task4_15 {
    public static void main(String[] args) {
        int YearBirth = 1986, MonthBirth = 10;
        int YearNow = 2023, MonthNow = 12;
        int FullAge = (YearNow - YearBirth);

        if (MonthNow - MonthBirth > 1){
            System.out.println("Возраст человека   " +FullAge );


        }
        else {

            System.out.println("Возраст человека   " + (FullAge + 1));

        }
    }
}
