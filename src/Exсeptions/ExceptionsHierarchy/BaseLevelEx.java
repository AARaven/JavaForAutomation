package Exсeptions.ExceptionsHierarchy;

public class BaseLevelEx extends Exception {
    
    String message;
    
    BaseLevelEx() {
        this.message = "{BaseLevelException} [default exception constructor]";
    }
    
    BaseLevelEx( String message ) {
        this.message = message;
    }
    
    public void throwEx() throws BaseLevelEx {
        throw new BaseLevelEx( "Base exception from super throwEx method." );
    }
}
