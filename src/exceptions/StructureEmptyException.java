package exceptions;

public class StructureEmptyException extends Exception {
    public StructureEmptyException(int capacity, int size) {
        super(String.format("Empty queue. Capacity: %d, Size: %d", capacity, size));
    }
    
}
