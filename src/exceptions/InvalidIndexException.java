package exceptions;

/**
 * Exception thrown when an invalid index is used.
 */
public class InvalidIndexException extends Exception {
    public InvalidIndexException(int index, int size) {
        super(String.format("Invalid index: %d, Size: %d", index, size));
    }
}
