package lecture.caculator;
//사용자 예외.
public class CalculatorException extends RuntimeException {

//이넘타입으로 상속을 넣음.

    private final CalculatorErrorCode errorCode;

    public CalculatorException(CalculatorErrorCode errorCode) {
       super(errorCode.getMessage()); // 메시지를 에러코드에 넣으려고 하니까.
        this.errorCode = errorCode;
    }

    public CalculatorErrorCode getErrorCode() {
        return errorCode;
    }
}
