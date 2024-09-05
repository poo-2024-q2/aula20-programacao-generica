package exceptions;

public class StructureFullException extends Exception {
    public StructureFullException(int capacity, int size) {
        super(String.format("Full queue. Capacity: %d, Size: %d", capacity, size));
    }    
}
