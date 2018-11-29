package ObjectBasics.AuthorAndBook;

public class Author {

    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAuthorFullname() {
        return firstName+" "+lastName;
    }

    public static void main(String[] args) {

        Author au = new Author("Russel", "Winderand");
        au.getAuthorFullname();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Author) {
            Author author = (Author) obj;
            if (!this.firstName.equals(author.firstName)) {
                return false;
            }
            if (!this.lastName.equals(author.lastName)) {
                return false;
            }

        } else {
            return false;
        }
        return true;
    }
}