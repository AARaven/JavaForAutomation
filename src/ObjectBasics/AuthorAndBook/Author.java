package ObjectBasics.AuthorAndBook;

public class Author {

    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAuthorFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Author) {
            Author author = (Author) obj;
            if (!this.firstName.equals(author.firstName)) {
                return false;
            }
            return this.lastName.equals(author.lastName);

        } else {
            return false;
        }
    }
}