class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Car is speeding");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();  // Calling parent class method
        car.speed(); // Calling child class method
    }
}