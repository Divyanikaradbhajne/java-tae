
class Person {
    void role() {
        System.out.println("Roleing action...");
    }
}

class Employee extends Person {
    @Override
    void role() {
        System.out.println("Employee Role...");
    }
}

class Manager extends Employee {
    @Override
    void role() {
        System.out.println("Manager Role...");
    }
}

public class q14 {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Manager();

        p1.role();
        p2.role();
        p3.role();
    }
}
