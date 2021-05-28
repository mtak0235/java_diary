package exception;

//사용자 정의 예외 클래스
public class IdFormatException extends Exception{
    public IdFormatException (String message) {
        super(message);
    }
}
