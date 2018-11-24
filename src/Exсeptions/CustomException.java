package Exсeptions;

public class CustomException extends Exception {

    private String message;

    public CustomException() {
        this.message = "default message.";
    }

    private CustomException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("This is a custom exception : %s.", super.getClass());
    }

    public String getMessage() {
        return this.message;
    }

    public static void main(String[] args) {

        try {
            throw new CustomException("Something wrong ...");
        } catch (CustomException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
