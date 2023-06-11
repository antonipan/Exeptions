package Task3;

import java.io.IOException;

public class NonExistedFileException extends IOException {

    public NonExistedFileException() {
        super("File not found ");
    }

    public NonExistedFileException(String message) {
        super(message);
    }
}
