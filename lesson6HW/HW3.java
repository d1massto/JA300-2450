package lesson6HW;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

/*
Создать файл story.txt, в котором будет записан любой текст
С помощью Scanner изучить все слова текста:
подсчитать количество чисел в тексте, которые можно принять за номер телефона
Под номером телефона будем понимать номер вида "89999999999",
т.е. число, начинающееся с 89 и длиной ровно 11 символов
Вывести на экран число телефонных номеров в тексте
 */
public class HW3 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new FileInputStream("story.txt"));
        int count = 0;
        while (sc.hasNext()) {
            if (sc.hasNextLong()) {
                long i = sc.nextLong();
                if (i >= 89000000000L && i <= 89999999999L) {
                    count++;
                }
            } else {
                String s = sc.next();
            }
        }
        System.out.printf("Количество телефонных номеров в тексте: %d", count);
    }
}