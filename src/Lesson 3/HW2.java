/*
Спросить у пользователя число N
С помощью цикла создать массив с числами от N до 10*N
Вывести все элементы массива на экран
*/

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrInt = new int[10];
        int j = 0;
        for (int i = 0; i < arrInt.length; i++) {
            j++;
            arrInt[i] = n * j;
            System.out.print(arrInt[i] + "; ");
        }
    }
}
