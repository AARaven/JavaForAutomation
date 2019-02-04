package Exсeptions;

public class TryCatchFinally {
    
    static void stackOverFlow() {
        stackOverFlow();
    }
    
    public static void main( String[] args ) throws StackOverflowError {
        
        try {
            throw new StackOverflowError( "STACK OVER FLOW!" );
        } catch ( StackOverflowError e ) {
            System.out.println( e );
        } finally {
            System.out.println( "DETECTED" );
        }
        
        try {
            stackOverFlow();
        } catch ( StackOverflowError e ) {
            System.out.println( "This stack over flow !" );
        }
    }
}
