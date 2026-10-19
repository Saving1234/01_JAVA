package lecture.section2.grammar;


//enum으로 권한을 만들 수 있다.

//에러코드르 상수로 정의. 예외를 상수로.
//핸들러로 동작.

public enum UserRole2 {

    //상수 .
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");


    //아래에는 상수의 값 넣기.
    //필드.
    //필드 초기화하려면 final 넣어야함.
    private final String decscription;

    //해당 상수의 생성자를 만들어야만이 초기화가 됨. 상수도;.
    UserRole2(String decscription) {
        this.decscription = decscription;
    }

    public String getDecscription() {
        return decscription;
    }
}
