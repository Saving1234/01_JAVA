package lecture.section01.enumtype;

public class Application {
//기본문법.
    public static void main(String[] args) {


        Subject subject1 = Subject.JAVA;
      //  Subject subject2 = Subject."문자열" //enum 필드로만 적을 수 있음.
        //subject가 이넘 타입.

        Subject subject2 = Subject.HTML;
        Subject subject3 = Subject.JAVA;

        if(subject1== subject2){
            System.out.println("두 과목은 같은 과목입니다");
        }else{
            System.out.println("다름");  //명백히 다른 과목. //이넘타입으로는 서로 다른 값.
        }


        System.out.println("subject ++ subject3 " + (subject1 == subject3)); //상수끼리는 같은 값.

        //스위치 문도 이넘에서 가능
        //상수 이름만 작성해도 가능.
        switch (subject3){
            case JAVA :
            case MYSQL:
            case JDBC:
                System.out.println("백엔드입니다");
                break;
            case HTML:
            case JAVASCRIPT:
            case CSS:

                System.out.println("프론트앤드입니다");
                break;
        }

       // printSubject("JAVA"); //문자열은 안됨.
        printSubject(subject3);

    }
    //컴파일 단계에서 잘못된 값 막는 방법.
    public static void printSubject(Subject subject){
        System.out.println("선택한 과목 : " + subject.name()); //네임은 이넘 타입 필드 이름?

    }
}
