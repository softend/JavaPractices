package Practice_9;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String errorMessage, Throwable err) {
        super(errorMessage,err);
    }
}
