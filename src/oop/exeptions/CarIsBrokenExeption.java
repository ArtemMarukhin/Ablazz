package oop.exeptions;

public class CarIsBrokenExeption extends Exception{
    public CarIsBrokenExeption() {
    }

    public CarIsBrokenExeption(String message) {
        super(message);
    }

    public CarIsBrokenExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public CarIsBrokenExeption(Throwable cause) {
        super(cause);
    }

    public CarIsBrokenExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
