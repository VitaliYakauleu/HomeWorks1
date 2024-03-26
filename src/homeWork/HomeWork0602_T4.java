package homeWork;

public class HomeWork0602_T4{
//4. Выполнить валидацию личного идентификационного номера РБ:
//3111111E001PB0
    public static void main(String[] args) {
        String idNumber = "3111111E001PB0";

        if (validateID(idNumber)) {
            System.out.println("Личный  номер РБ верен");
        } else {
            System.out.println("Личный  номер РБ неверен");
        }
    }

    public static boolean validateID(String idNumber) {
        String regex = "\\d{7}[A-Z]\\d{3}[A-Z]{2}\\d";
        return idNumber.matches(regex);
    }
}