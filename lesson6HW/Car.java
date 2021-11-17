package lesson6HW;

public class Car implements Vehicle {
    double x,y,speed;

    public Car() {};

    public Car(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    };

    @Override
    public void move(double new_x, double new_y) {
        x = new_x;
        y = new_y;
        System.out.printf("%f , %f\n", x,y);
    }

    @Override
    public void changeSpeed(double inc) {
        speed += inc;
        System.out.printf("Скорость равна %f\n", speed);
    }

}
