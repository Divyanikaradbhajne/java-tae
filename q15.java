
abstract class Ride {
    double distance;

    Ride(double d) {
        distance = d;
    }

    abstract void calculateFare();
}

class BikeRide extends Ride {
    BikeRide(double d) {
        super(d);
    }

    @Override
    void calculateFare() {
        double fare = distance * 5;
        System.out.println("Bike Ride Fare = $" + fare);
    }

}

class AutoRide extends Ride {
    AutoRide(double d) {
        super(d);
    }

    @Override
    void calculateFare() {
        double fare = distance * 8;
        System.out.println("Auto Ride Fare = $ " + fare);
    }

}

class CarRide extends Ride {
    CarRide(double d) {
        super(d);
    }

    @Override
    void calculateFare() {
        double fare = distance * 12;
        System.out.println("Car Ride Fare = $  " + fare);
    }

}

public class q15 {

    public static void main(String[] args) {
        Ride r1 = new AutoRide(45);
        Ride r2 = new BikeRide(35);
        Ride r3 = new CarRide(67);

        r1.calculateFare();
        r2.calculateFare();
        r3.calculateFare();

    }
}
