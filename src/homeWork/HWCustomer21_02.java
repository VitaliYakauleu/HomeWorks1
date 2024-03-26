package homeWork;

import java.util.*;

public class HWCustomer21_02 {

    public static void main(String[] args) {
        // Создаем массив объектов Customer
        Customer[] customers = {
                new Customer(1, "Иванов", "Иван", "Иванович", "ул. Ленина, 10", "1234567890123456", "1234567890"),
                new Customer(2, "Петров", "Петр", "Петрович", "ул. Пушкина, 20", "2345678901234567", "2345678901"),
                new Customer(3, "Сидоров", "Сидор", "Сидорович", "ул. Горького, 30", "3456789012345678", "3456789012"),
                new Customer(4, "Васильев", "Василий", "Васильевич", "ул. Чехова, 40", "4567890123456789", "4567890123"),
                new Customer(5, "Смирнов", "Сергей", "Сергеевич", "ул. Толстого, 50", "5678901234567890", "5678901234")
        };

        // a) Выводим список покупателей в алфавитном порядке
        System.out.println("Список покупателей в алфавитном порядке:");
        Arrays.sort(customers, Comparator.comparing(Customer::getLastName));
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        // b) Выводим список покупателей, у которых номер кредитной карточки находится в заданном интервале
        System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится в интервале от 2345678901234567 до 4567890123456789:");
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber().compareTo("2345678901234567") >= 0 && customer.getCreditCardNumber().compareTo("4567890123456789") <= 0) {
                System.out.println(customer);
            }
        }
    }

    // Класс Customer представляет покупателя
    private static class Customer {
        private int id;
        private String lastName;
        private String firstName;
        private String middleName;
        private String address;
        private String creditCardNumber;
        private String bankAccountNumber;

        public Customer(int id, String lastName, String firstName, String middleName, String address, String creditCardNumber, String bankAccountNumber) {
            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
            this.middleName = middleName;
            this.address = address;
            this.creditCardNumber = creditCardNumber;
            this.bankAccountNumber = bankAccountNumber;
        }

        public int getId() {
            return id;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getAddress() {
            return address;
        }

        public String getCreditCardNumber() {
            return creditCardNumber;
        }

        public String getBankAccountNumber() {
            return bankAccountNumber;
        }

        @Override
        public String toString() {
            return String.format("%s %s %s (%s)", lastName, firstName, middleName, id);
        }
    }
}