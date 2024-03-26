package homeWork;

public class HomeWorkPattern {
    public static void main(String[] args) {
        // Получение экземпляра класса Singleton
        Singleton singleton = Singleton.getInstance();

        // Вызов метода showMessage() экземпляра класса Singleton
        singleton.showMessage();
    }
}
