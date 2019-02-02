package ObjectBasics.AuthorAndBook;

import java.util.Objects;

public class Author {

    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }
    
    @Override
    public boolean equals(Object obj) {
        if ( obj == this ) {
            return true;
        }
    
        if ( !( obj instanceof Author ) ) {
            return false;
        }
        
        Author author = ( Author ) obj;
        return this.getFirstName().equals( author.getFirstName() )
                && this.getLastName().equals( author.getLastName() );
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.getFirstName(), this.getLastName() );
    }
    
    @Override
    public String toString() {
        return String.format( "%s %s", this.getFirstName(), this.getLastName() );
    }
}