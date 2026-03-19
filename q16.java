
class Staff {
    void work() {
        System.out.println("Staff is Working");
    }
}

class Doctor extends Staff {
    @Override
    void work() {
        System.out.println("Doctor is Checking the patient");
    }
}

class Nurse extends Staff {
    @Override
    void work() {
        System.out.println("Nurse is Examin the patient");
    }
}

class Receptionist extends Staff {
    @Override
    void work() {
        System.out.println("Receptionist Handling The bills");
    }
}

public class q16 {

    public static void main(String[] args) {
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        s1.work();
        s2.work();
        s3.work();
    }
}
