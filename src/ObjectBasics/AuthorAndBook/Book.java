package ObjectBasics.AuthorAndBook;

public class Book {

    String title;
    Author author;
    double price;

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void getBookDetails() {

        System.out.print("The title the book is : " +title +"\n");
        System.out.print("The author the book is : " +author.getAuthorDetails()+"\n");
        System.out.print("The price the book is : " +price +"\n\n");
    }


    public static void main(String[] args) {

        Author exampleAuthor = new Author("Russel", "Winderand");
        Book exampleBook = new Book("Developing Java Software", exampleAuthor, 79.75);
        exampleBook.getBookDetails();
    }
}
