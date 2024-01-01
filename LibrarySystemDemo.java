import java.util.ArrayList;
import java.util.List;

// Book class represents a book entity
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

// Library class manages the collection of books
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Display all books in the library
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new library instance
        Library library = new Library();

        // Add some books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("1984", "George Orwell"));

        // Display all books in the library
        System.out.println("Books in the library:");
        library.displayBooks();

        // Remove a book from the library
        Book bookToRemove = new Book("1984", "George Orwell");
        library.removeBook(bookToRemove);

        // Display all books again after removal
        System.out.println("\nAfter removing 1984:");
        library.displayBooks();
    }
}
