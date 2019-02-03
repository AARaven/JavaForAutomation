package ObjectBasics.AuthorAndBook;

import java.util.Objects;

public class Author {
    
    private String firstName;
    private String lastName;
    
    private String getFirstName() {
        return this.firstName;
    }
    
    private void setFirstName( String firstName ) {
        this.firstName = firstName;
    }
    
    private String getLastName() {
        return this.lastName;
    }
    
    private void setLastName( String lastName ) {
        this.lastName = lastName;
    }
    
    public Author( String firstName, String lastName ) {
        this.setFirstName( firstName );
        this.setLastName( lastName );
    }
    
    @Override
    public boolean equals( Object object ) {
        if ( object == this ) {
            return true;
        }
        
        if ( !( object instanceof Author ) ) {
            return false;
        }
        
        Author author = ( Author ) object;
        return this.getFirstName().equals( author.getFirstName() )
                && this.getLastName().equals( author.getLastName() );
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
                this.getFirstName(),
                this.getLastName() );
    }
    
    @Override
    public String toString() {
        return String.format( "%s %s",
                this.getFirstName(),
                this.getLastName() );
    }
}