package homeWork;

public class HomeWork0602_T3 {
//Выполнить валидацию номера кредитной карты:
//    Visa : 13 или 16 цифр, начиная с 4.
//    MasterCard : 16 цифр, начиная от 51 до 55.
    public static boolean validateCreditCard(String creditCardNumber) {
        if(creditCardNumber.matches("^4[0-9]{12}(?:[0-9]{3})?$")) {
            return true; // Visa card
        } else if(creditCardNumber.matches("^5[1-5][0-9]{14}$")) {
            return true; // MasterCard
        } else {
            return false; // неверный номер карты
        }
    }

    public static void main(String[] args) {
        String visaCardNumber = "4532756279624063";
        String masterCardNumber = "5210764269337256";

        System.out.println("Is Visa card valid: " + validateCreditCard(visaCardNumber));
        System.out.println("Is MasterCard valid: " + validateCreditCard(masterCardNumber));
    }
}