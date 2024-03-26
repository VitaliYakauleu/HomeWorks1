package homeWork;
import java.io.File;

public class HomeWorkStr3_1 {
    public static void main(String[] args) {
        //используем класс File для работы с путями файлов
        String filePath = "C:\\Windows\\System32\\calc.exe";
        File file = new File(filePath);

        // Извлекаем каталог
        String directory = file.getParent();

        // Извлекаем краткое имя файла
        String fileName = file.getName();

        // Извлекаем расширение файла
        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);

        System.out.println("Каталог: " + directory);
        System.out.println("Краткое имя файла: " + fileName);
        System.out.println("Расширение файла: " + extension);
    }
}