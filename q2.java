import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("---------------------------");
    }
}

class Library {

    ArrayList<Book> books = new ArrayList<Book>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully");
    }

    // Method to remove book by ISBN
    void removeBook(String ISBN) {
        for (Book b : books) {
            if (b.ISBN.equals(ISBN)) {
                books.remove(b);
                System.out.println("Book removed successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book b : books) {
                b.displayBook();
            }
        }
    }
}

// Main Class
public class q2 {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java Programming", "James Gosling", "101");
        Book b2 = new Book("Data Structures", "Mark Allen", "102");
        Book b3 = new Book("Operating System", "Silberschatz", "103");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        System.out.println("\nList of Books:");
        lib.displayBooks();

        // Removing a book
        lib.removeBook("102");

        System.out.println("\nAfter Removing Book:");
        lib.displayBooks();
    }
}
