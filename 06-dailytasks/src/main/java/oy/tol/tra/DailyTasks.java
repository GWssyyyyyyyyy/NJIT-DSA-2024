package oy.tol.tra;

/**
 * Exception thrown when allocation in the queue fails.
 */
public class DailyTasks extends RuntimeException {
   /** Instantiate with a message.
    * @param message The explanation for the exception.
    */
   public DailyTasks(String message) {
      super(message);
   }
}