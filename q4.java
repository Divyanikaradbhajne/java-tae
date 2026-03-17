import java.util.Scanner;

class Resort {
    int rollNo;
    String Name;
    float Charges;
    int Days;
    float Amount;

    float cal() {
        Amount = Days * Charges;
        if (Amount > 11000) {
            Amount = 1.02f * Amount;
        }
        return Amount;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. enter kre: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Ab naam btaye: ");
        Name = sc.nextLine();
        System.out.print("toh ye hai per day: ");
        Charges = sc.nextFloat();
        System.out.print("ab btaye kitne din rukna hai: ");
        Days = sc.nextInt();
    }

    void DispInfo() {
        cal();
        System.out.println("Room No: " + rollNo);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Amount: " + Amount);
    }
}

public class q4 {
    public static void main(String[] args) {

        Resort r = new Resort();

        r.Getinfo();
        r.DispInfo();
    }
}
