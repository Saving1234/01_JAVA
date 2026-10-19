package lecture.caculator;
//에러코드르 상수로 정의. 예외를 상수로.
//핸들러로 동작.
public enum CalculatorErrorCode {

    INVALID_OPERATOR("CAL-001", "+,/,exit만 입력할 수 있습니다"),
    INVALID_NUMBER("CAL-002", "숫자형식으로 입력해주세요"),
    DEVIDE_BY_ZERO("CAL - 003", "\"0으로 나눌 수 없음\"");

    private final String code;
    private final String message;

    //이넘은 해당 생성자가 있어야 값을 넣을 수 있고, 초기화도 가능하니까.
    CalculatorErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }



    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
