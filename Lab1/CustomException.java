package Lab1;
// Define a custom exception
class MyCustomException extends Exception {
    MyCustomException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            checkValue(5);
        } catch (MyCustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    static void checkValue(int value) throws MyCustomException {
        if (value < 10) {
            throw new MyCustomException("Value is too small!");
        }
    }
}
