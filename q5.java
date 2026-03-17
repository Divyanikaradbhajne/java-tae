class Employee {
    int empno;
    String empname;
    float basic, hra, da;
    float netpay;

    float calculate() {
        netpay = basic + hra + da;
        return netpay;

    }

    void haveData(int eno, String n, float b, float h, float d) {
        empno = eno;
        empname = n;
        basic = b;
        hra = h;
        da = d;
        netpay = calculate();
    }

    void displayData() {
        System.out.println("EmpNo: " + empno);
        System.out.println("EmpName: " + empname);
        System.out.println("Basic: " + basic);
        System.out.println("Hra: " + hra);
        System.out.println("Da: " + da);
        System.out.println("Netpay: " + netpay);
    }
}

public class q5 {

    public static void main(String[] args) {
        Employee e = new Employee();

        e.haveData(191, "Aditya", 50000, 6000, 7000);
        e.displayData();

    }
}