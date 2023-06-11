package Task3;

public class DivideByZeroExсeption extends RuntimeException {
    public DivideByZeroExсeption (){
        super("Делить на ноль нельзя");
    }

    public DivideByZeroExсeption(String message) {
        super(message);
    }
}
