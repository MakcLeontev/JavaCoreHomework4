public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(String message, int i, int j) {
        super(message);
    }
}
