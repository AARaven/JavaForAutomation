package ObjectBasics.AuthorAndBook;

public class BookDemo {

    public static void main(String[] args) {
        Author exampleAuthor = new Author("Russel", "Winderand");
        Book exampleBook = new Book("Developing Java Software", exampleAuthor, 79.75);
        exampleBook.getBookDetails();
        System.out.println(exampleAuthor);
        System.out.println(exampleBook);
    }
}
