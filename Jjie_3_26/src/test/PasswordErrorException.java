package test;

public class PasswordErrorException extends RuntimeException{
    public PasswordErrorException(String message) {
        super(message);
    }

    public PasswordErrorException() {
    }
}
