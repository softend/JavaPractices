package Practice_9;

public class EmptyStringException extends RuntimeException{
    public EmptyStringException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
