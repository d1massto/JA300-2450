/*
Создать массив с любыми целыми числами
Посчитать сумму элементов массива и если она больше 100, вывести "Большой массив"
*/

public class HW1 {

    public static void main(String[] args) {
        int[] arrInt = new int[]{12, 52, 34, 21, 11};
        int sum = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sum = sum + arrInt[i];
        } if (sum>100){
            System.out.println("Большой массив");
        } else System.out.println("Cумма массива = " + sum);
    }
}
