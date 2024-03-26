package homeWork;

public class Singleton {

    // Приватное статическое поле, которое хранит единственный экземпляр класса
    private static Singleton instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров класса извне
    private Singleton() {
    }

    // Публичный статический метод для получения экземпляра класса
    public static Singleton getInstance() {
        // Если экземпляр класса еще не был создан, создаем его
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Пример метода класса
    public void showMessage() {
        System.out.println("Алексей я нконец то прислал вам доашнее задание в gitHub");
    }
}
