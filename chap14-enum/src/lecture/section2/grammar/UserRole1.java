package lecture.section2.grammar;


//enum으로 권한을 만들 수 있다.

import java.util.Locale;

public enum UserRole1 {

    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;

    //자바 클래스라서 생성자 있음.
    //근데 잘 안만듬.
    //상수라서 스태틱 성향이 있어서.
    //static -> jvm 클래스 로드 -> static.
    //바로 메모리에 올리는 것이 static.


    //상수들을 만드릭 위해 생성자가 호출이 됨.
    //이넘타입 처음 사용하면 모든 상수가 생성성자의 선언 순서대로 한번 씩 호출된다.
    //그래서 생성자 호출 안함.
    UserRole1() {
        System.out.println("[UserRole1] 초기화" + this.name());
    }

    public String getNameToLowerccase(){
        return this.name().toLowerCase(); //소문자로 바꾸기. this.name으로 이넘 필드
    }

}
