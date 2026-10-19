package lecture.section01.generic;

//메소드 명 괄호 안 매개변수처럼 클래스 명 <키워드> 넣어줌.
//제네릭 설정은 클래스 명 옆에 다이아몬드 연산자 (꺽쇠)
//연상자 내부에 작성하는 영문자는 대문자 (관례)

public class Generic <T>{

    private T value; //value로 값을 받음.

    public Generic(T value) {
        this.value = value;
    }

    //getter/setter

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
