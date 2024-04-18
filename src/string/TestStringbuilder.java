package string;

public class TestStringbuilder {
    public static void main(String[] args) {
        String test = "Hello my dear Vitali1986";
        StringBuilder builder = new StringBuilder("Привет");


        //Преобразовывает переданный объект в строку и добавляет к текущей строке
        builder.append("Vitali");
        System.out.println(builder);

        //Преобразовывает переданный объект в строку и вставляет в текущую строку
        StringBuilder builder1 = new StringBuilder("Привет");
        builder1.insert(6," vital");
        System.out.println(builder1);

        //Заменяет часть строки, заданную интервалом start..end на переданную строку
        StringBuilder builder2 = new StringBuilder("Привет");
        builder2.replace(0,6,test);
        System.out.println(builder2);

        //Удаляет из строки символ под номером index
        StringBuilder builder3 = new StringBuilder("Привет");
        builder3.deleteCharAt(0);
        System.out.println(builder3);

        //Удаляет из строки символы, заданные интервалом
        StringBuilder builder4 = new StringBuilder("Привет");
        builder4.delete(1,5);
        System.out.println(builder4);

        //Ищет подстроку в текущей строке
        //test.indexOf("ет",6);
        System.out.println(test.indexOf("П",1));

        //Возвращает символ строки по его индексу
        System.out.println( test.charAt(3));

        //Возвращает подстроку, заданную интервалом
        System.out.println(test.substring(6,13));

        //Разворачивает строку задом наперед.
        StringBuilder builder5 = new StringBuilder("Привет");
        System.out.println(builder5.reverse());

        //Изменяет символ строки, заданный индексом на переданный
        StringBuilder builder6 = new StringBuilder("Привет");
        builder6.setCharAt(0, 'C');
        System.out.println(builder6);

        //Возвращает длину строки в символах
        System.out.println(test.length());



    }
}
