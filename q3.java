class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    public float getRent() {
        if (CarType.equalsIgnoreCase("Samll car")) {
            return 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            return 8000;
        } else if (CarType.equalsIgnoreCase("Suv")) {
            return 25000;
        } else {
            return 0;
        }

    }

    void ShowCar() {
        Rent = getRent();
        System.out.println("Car Id: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }
}

public class q3 {

    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar(191, "Small Car");
        c.ShowCar();
        c.GetCar(199, "Suv");
        c.ShowCar();

    }
}