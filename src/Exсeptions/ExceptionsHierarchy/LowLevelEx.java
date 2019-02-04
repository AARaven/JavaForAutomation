package Exсeptions.ExceptionsHierarchy;

public class LowLevelEx extends MiddleLevelEx {
    
    String message;
    
    LowLevelEx() {
        this.message = "{LowLevelException} [default constructor message]";
    }
    
    LowLevelEx( String message ) {
        this.message = message;
    }
    
    @Override
    public void throwEx() throws LowLevelEx {
        throw new LowLevelEx( "Lower exception from throwEx method." );
    }
}
