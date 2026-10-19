package lecture.section07.finalkeyword;

public class Finalfiledtest {

    /*
    final : 변경불가
    지역변수 -> 초기화 이후 값 변경 불가
    매개변수 -> 호출 시 전달한 인자 변경 불가
    전역변수 -> 인스턴스 생성 후 초기화 이후에 변경불가
    정적변수 -> 프로그램 시작 후 변경 불가
    메소드 -> 메소드 재작성(overriding) 불가
     */

    private final int NON_STATIC_NUM = 1;
    private Finalfiledtest(String NON_STATIC_NUM) {}

}
