
abstract class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void calculateBonus();
}

class Manager extends Employee {
    Manager(String n, int i, double sal) {
        super(n, i, sal);
    }

    @Override
    void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println("Manager salary: " + bonus);
    }

}

class Devloper extends Employee {
    Devloper(String n, int i, double sal) {
        super(n, i, sal);
    }

    @Override
    void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println("Devloper salary: " + bonus);

    }

}

public class q13 {

    public static void main(String[] args) {
        Employee e;
        e = new Manager("Aditya", 191, 50000);
        e.calculateBonus();

        e = new Devloper("Ayushi", 199, 50000);
        e.calculateBonus();

    }
}
