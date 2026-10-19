package practice.level2;

// 사용자 정의 예외
// 예외를 위한 코드는 JAVA 에서 만들어놨음 defaultMessage
public class TraafficEnum extends RuntimeException {

    private final TrafficLight warningLight;

    public TraafficEnum(TrafficLight warningLight) {
        super(warningLight.getTraffic()); // 이게 뭐한걸까요? super() : 부모의 매개변수 있는 생성자호출
        // 문자열을
        this.warningLight = warningLight;
    }

    TrafficLight getWarningLight(){
        return warningLight;
    }
}
