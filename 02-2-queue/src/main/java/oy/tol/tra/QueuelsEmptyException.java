package oy.tol.tra;

/**
 * Exception thrown when using an empty queue fails.
 */
public class QueuelsEmptyException extends RuntimeException {
    /** Instantiate with a message.
     * @param message The explanation for the exception.
     */
    public QueuelsEmptyException(String message) {
        super(message);
    }
}