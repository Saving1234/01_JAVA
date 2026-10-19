package lecture.section03.interfaceinplements;

public interface InterProduct {

    //인터페이스
    /*
      상수필드와 추상메서드만 가질 수 있다.
      (static final int)

      클래스를 작성하기 위한 틀.
      특정 클래스 작성할 때 ~~형식으로 작성.(이건 상속 x 구현한다 ㅇ)
      implement.
     */

    //상수 : 대문자와 _로 단어를 구분하게끔 표기한다.
    //선언과 동시에 초기화 해야함.
    public static final int MAX_NUM = 100;

    //생성자를 가질 수 없음.
    //일반 메서드도 가질 수 없음.
    //public void method(){}

    //추상메서드
    //접근제어자는 public으로 고정.
    public abstract void nonStaticMethod();

    //보통은 이렇게 쓰임.
    //public abstract의 의미를 가지기 때문에 생략해서 작성 가능.
    //접근제어자는 public 고정.
    void abstMethod();

    //static 메서드는 가질 수 있음.
    public static void staticMethod(){}

    //default도 가질 수 있음.
    public default void defaultMethod(){}
}
