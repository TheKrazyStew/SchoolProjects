public class EmptyCollectionException extends RuntimeException{
  /**
  * Sets up this exception with an appropriate message.
  *
  * @param collection  the exception message to deliver
  */
  public EmptyCollectionException (String collection){
    super ("The " + collection + " is empty.");
  }
}