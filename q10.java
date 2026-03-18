
interface Bank {
    public void getInterestRate();
}

class SBI implements Bank {

    @Override
    public void getInterestRate() {
        double Interest = 0.6;
        System.out.println("SBI:" + Interest);
    }

}

class HDFC implements Bank {

    @Override
    public void getInterestRate() {
        double Interest = 0.7;
        System.out.println("HDFC:" + Interest);
    }

}

class ICICI implements Bank {

    @Override
    public void getInterestRate() {
        double Interest = 0.7;
        System.out.println("ICICI:" + Interest);
    }

}

public class q10 {

    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        b.getInterestRate();

        b = new HDFC();
        b.getInterestRate();

        b = new ICICI();
        b.getInterestRate();
    }
}
