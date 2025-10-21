package I__opps.car;

public class use_car {
    public static void main(String[] args) {
        Car cr = new Car();
        cr.model="Tata Safari";
        cr.brand = "Tata";
        cr.color="Black";
        cr.year = 2025;
        cr.accelerate(20);
        cr.brake(10);
        System.out.println(cr.brand);
    }
}
