package homeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Имеется текстовый файл. Напечатать:
//а) все его строки, начинающиеся с буквы Т;

public class HWReadTxt {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/data/test.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("t")) {
                    System.out.println(line);
                }
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}