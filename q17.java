
class Employee {
    String name;
    int id;

    // Static variable
    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    // Static method to display total employees
    static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class q17 {
    public static void main(String[] args) {

        // Creating multiple employee objects
        Employee e1 = new Employee("Aditya", 191);
        Employee e2 = new Employee("Ayushi", 199);
        Employee e3 = new Employee("Ananya", 103);

        // Display total employees
        Employee.displayEmployeeCount();
    }
}
