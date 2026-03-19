
class Employee {
    String name;
    double salary;

    Employee(String n, double sal) {
        this.name = n;
        this.salary = sal;
    }

    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class q20 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Aditya", 900000);
        Employee e2 = new Employee("Ayushi", 900000);
        e1.displayData();
        e2.displayData();
    }
}
