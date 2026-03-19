
class Book {
    String Title;
    String Author;
    double Price;

    Book(String t, String a, double p) {
        Title = t;
        Author = a;
        Price = p;

    }

    void displayData() {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Price: " + Price);
        System.out.println();
    }
}

public class q19 {

    public static void main(String[] args) {
        Book[] b = new Book[3];
        b[0] = new Book("The Alchemist", "Paulo Coelho", 45000);
        b[1] = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 5000);
        b[2] = new Book("Pride and Prejudice", "Jane Austen", 3000);

        b[0].displayData();
        b[1].displayData();
        b[2].displayData();
    }

}
