
abstract class Shape {

    abstract void calculate_area();

    void display_info() {
        System.out.println("In the Shape class");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculate_area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void calculate_area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class q11 {
    public static void main(String[] args) {

        // Shape s = new Shape(); // ERROR: cannot instantiate abstract class

        Circle c = new Circle(5);
        c.display_info();
        c.calculate_area();

        Rectangle r = new Rectangle(4, 6);
        r.display_info();
        r.calculate_area();
    }
}
