package 异常;

public class MyException extends Exception {
    static final long serialVersionUID = -3387516993134229948L;

    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }
}
