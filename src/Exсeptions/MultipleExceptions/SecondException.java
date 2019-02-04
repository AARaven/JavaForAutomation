package Exсeptions.MultipleExceptions;

class SecondException extends Exception {
    
    String msg;
    
    SecondException( String msg ) {
        this.msg = msg;
    }
}
