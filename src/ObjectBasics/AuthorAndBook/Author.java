package ObjectBasics.AuthorAndBook;

public class Author {

    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }


    public String getAuthorDetails() {

        return firstName+" "+lastName;

    }


    public static void main(String[] args) {

        Author au = new Author("Russel", "Winderand");
        au.getAuthorDetails();
    }
}