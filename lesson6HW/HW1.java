package lesson6HW;
/*
Создать интерфейс Vehicle, определяющий что может делать транспортное средство
    В нём будут заданы два метода
        move с двумя дробными аргументами new_x и new_y без возвращаемого значения
        changeSpeed с одним дробным аргументом с именем inc
Определить класс Car
    Три дробных поля x, y и speed
    Пустой конструктор, конструктор с тремя аргументами
    Реализация move - установить x и y равными значениям new_x и new_y
    Реализация changeSpeed - увеличить скорость на inc
В psvm создать автомобиль, проверить работу его методов move и changeSpeed
 */
public class HW1 {
    public static void main(String[] args) {

        Car c = new Car(1.4, 1.3, 1.2 );
        c.move(1.3, 2.1);
        c.changeSpeed(1.1);
    }
}
