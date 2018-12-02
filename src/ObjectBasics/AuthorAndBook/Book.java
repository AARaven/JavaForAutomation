package ObjectBasics.AuthorAndBook;

public class Book {

    private double price;
    private String title;
    private Author author;

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void getBookDetails() {

        System.out.print("The title the book is : " + this.title + "\n");
        System.out.print("The author the book is : " + this.author.getAuthorFullName() + "\n");
        System.out.print(String.format("The price the book is : %.2f" + "\n\n", price));
    }

    protected static void main(String[] args) {

        Author exampleAuthor = new Author("Russel", "Winderand");
        Book exampleBook = new Book("Developing Java Software", exampleAuthor, 79.75);
        exampleBook.getBookDetails();
    }
}
