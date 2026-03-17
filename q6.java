class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        int length = 140;
        int breadth = 230;

    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;

    }

    int area() {
        return length * breadth;
    }

}

public class q6 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(23, 45);
        System.out.println("Area : " + r1.area());

        Rectangle r2 = new Rectangle(20, 15);
        System.out.println("Area: " + r2.area());
    }
}