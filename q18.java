
class Bank {

    final double InterestRate = 5.0;

    double calculateInterest(double amount) {
        return (amount * InterestRate) / 100;

    }
}

public class q18 {

    public static void main(String[] args) {
        Bank b = new Bank();
        double customer1 = 10000;
        double customer2 = 20000;
        double customer3 = 50000;

        System.out.println("Interest for Customer 1: " + b.calculateInterest(customer1));
        System.out.println("Interest for Customer 2: " + b.calculateInterest(customer2));
        System.out.println("Interest for Customer 3: " + b.calculateInterest(customer3));
    }
}
