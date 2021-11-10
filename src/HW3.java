/*
Создать метод, у которого:
    имя calcArea
    входной аргумент (параметр) дробное число radius
    выходной тип данных - дробное число
Метод должен возвращать результат вычисления площади круга (формула для этого - PI * radius * radius)
Как значение PI можно использовать или переменную со значением 3.14, или Math.PI
 */

public class HW3 {

    static double calcArea(double radius){return Math.PI * radius * radius ;}

    public static void main(String[] args) {
        System.out.println(calcArea(3));
    }
}
