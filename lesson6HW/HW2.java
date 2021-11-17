package lesson6HW;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
В psvm по байтам скопировать любой файл с изображением
Использовать FileInputReader и FileOutputWriter как в методе streamsByte класса Main
При этом после чтения байта из исходного файла,
записывать в выходной файл значение этого байта увеличенное на 1 (т.е. изменить написание строки 60)
P.S. psvm дополнить "throws IOException" после "(String[] args)" и до начала фигурных скобок,
как psvm в классе Main
 */
public class HW2 {
    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream("picture.jpg");
        FileOutputStream output = new FileOutputStream("picture1.jpg");

        int i = 0;
        while (i != -1) {
            i = input.read();
            char c = (char) i;
            output.write(c+1);
        }
        input.close();
        output.close();
    }
}
