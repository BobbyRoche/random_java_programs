//Robert Roche Project 2
//Gerald Cohen Ph.D.
//Due 10/6/2016
package project2;


public class EmptyDeckException extends Exception {

    /**
     * Creates a new instance of <code>EmptyDeckException</code> without detail
     * message.
     */
    public EmptyDeckException() {
        super("Deck is empty");
    }

    /**
     * Constructs an instance of <code>EmptyDeckException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyDeckException(String msg) {
        super(msg);
    }
}
