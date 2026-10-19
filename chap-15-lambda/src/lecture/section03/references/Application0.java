package lecture.section03.references;

//메서드 참조.


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Application0 {

    public static void main(String[] args) {


        /*
            이미 존재하는 메서드를 람다식에서 호출할 때 사용하는 축약 문법.
            클래스 이름 :: 메소드이름
            참조변수이름 :: 메소드이름

         */

        //객체 생성안해도 참조 변수를 쓸 수 있는 건가?

        List<String> names = Arrays.asList("홍길동", "유관순", "이순신");

        Consumer<String> consumer = (str) -> System.out.println(str);

        //forEach : consumer가 매개변수로 들어가있음. consumer로 실행.

        names.forEach(System.out::println);
    }

}
