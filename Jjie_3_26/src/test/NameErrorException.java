package test;

public class NameErrorException extends RuntimeException{
    public NameErrorException(){
        super();
    }

    public NameErrorException(String message) {
        super(message);
    }
}
