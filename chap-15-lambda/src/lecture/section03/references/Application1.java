package lecture.section03.references;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class Application1 {

    public static void main(String[] args) {

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("css");

        //Function : 매개변수 O, 리턴값 O : apply()
        //객체명 : 클래스 :: 정적 메서드

        Function<String, String> function = (str) ->  str.toUpperCase();

        //stream : 배열이나 컬렉션을 좀 더 잘 다루기 위한 문법.
        subjects.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        //앞,클래스. 뒤, 정적메서드.
        subjects.forEach(Example::printName);

    }
}
