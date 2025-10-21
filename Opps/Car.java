package I__opps.car;

public class Car {
    String brand;
    String color;
    String model;
    int year;
    int speed;
    public void accelerate(int increment){
        speed+= increment;
    }
    void brake (int increment) {
        speed -= increment;
        if (speed < 0) speed = 0;
    }
}
