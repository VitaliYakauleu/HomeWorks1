package classmetod;
//Задача: Создать
// класс "Книга" с полями "название", "автор" и "год издания".
// Определить конструкторы и методы для получения и изменения значений полей.
public class book {
    public static void main(String[] args) {
        Book book = new Book("Antikiller", "koretskiy",2000);
        System.out.println(book.getName()+" "+ book.getAuthor()+" " +book.getSince());

        book.setAuthor("vit");

    }
    public static class Book{
        private String name;
        private String author;
        private int since;

        public Book(String name, String author, int since){
            this.name=name;
            this.author= author;
            this.since = since;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getSince() {
            return since;
        }

        public void setSince(int since) {
            this.since = since;
        }
    }
}
