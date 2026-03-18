class Calculator {
    int add1(int a, int b) {
        return a + b;

    }

    int add2(int a, int b, int c) {
        return a + b + c;

    }

    double add3(double a, double b) {
        return a + b;
    }

}

public class q9 {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int sum1 = c.add1(23, 45);
        int sum2 = c.add2(23, 45, 67);
        double sum3 = c.add3(45.56, 67.78);

        System.out.println("Sum of two integer: " + sum1);
        System.out.println("Sum of three integer: " + sum2);
        System.out.println("Sum of  two double: " + sum3);

    }
}