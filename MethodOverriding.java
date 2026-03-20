class Vehicle {
    int speed;

    public void displaySpeed() {
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Car Speed: " + speed);
    }
}

class Bike extends Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Bike Speed: " + speed);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.speed = 120;

        Bike b1 = new Bike();
        b1.speed = 200;

        c1.displaySpeed();
        b1.displaySpeed();
    }
}
