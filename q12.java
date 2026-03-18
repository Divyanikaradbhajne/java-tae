
abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Credit card Payment Done: " + amount);
    }

}

class UPIPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("UPI Payment Done : " + amount);
    }

}

class NetBankingPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Net Banking Payment Done:" + amount);
    }

}

public class q12 {

    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment();
        c.pay(50000);
        UPIPayment u = new UPIPayment();
        u.pay(450000);
        NetBankingPayment n = new NetBankingPayment();
        n.pay(340000);
    }
}
