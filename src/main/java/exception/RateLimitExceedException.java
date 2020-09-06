package exception;

public class RateLimitExceedException extends RuntimeException {
    public RateLimitExceedException(String message){
        super(message);
    }
}
