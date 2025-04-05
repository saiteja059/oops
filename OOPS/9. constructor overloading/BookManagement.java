class Book {
    String title;
    String author;
    int pages;

    // Constructor 1: No parameters
    Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        pages = 0;
    }

    // Constructor 2: Title only
    Book(String t) {
        title = t;
        author = "Unknown Author";
        pages = 100;
    }

    // Constructor 3: Title and Author
    Book(String t, String a) {
        title = t;
        author = a;
        pages = 200;
    }

    // Constructor 4: All parameters
    Book(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
}

public class BookManagement {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics");
        Book b3 = new Book("Python Guide", "John Doe");
        Book b4 = new Book("C++ Pro", "Alice", 450);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
