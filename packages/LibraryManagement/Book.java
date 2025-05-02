package LibraryManagement;

public class Book {
    String title;
    String author;
    int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void display() {
        System.out.println("\n*** Book Details ***");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + isbn);
    }
}
