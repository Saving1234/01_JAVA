package lecture.section01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application0 {

    //컬렉션에 저장된 요소들을 하나씩 순회하면서 처리할 수 있는 기능.


    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("hello", "world"));

        for(String rr : stringList){
            System.out.println(rr);
        }

        stringList.forEach(str -> System.out.println(str)); //최종연산스트림?
        //컬렉션 안에 구현되어있는 forEach.

        stringList.stream().forEach(str -> System.out.println(str)); //중간연산스트림. 동작은 같다.

        stringList.stream()
                .forEach(str -> System.out.println(str)); //중간연산스트림. 동작은 같다.

        IntStream intStream = IntStream.range(5,10);
        intStream.forEach( i ->System.out.println(i));

        Stream<String> stringStream = Stream.of("java", "html");
        Stream<String> stringStream2 = Stream.of("jdbc", "js");


        //동일 스트림 합치기.
        Stream<String> contacStream = Stream.concat(stringStream, stringStream2);
        contacStream.forEach((str) -> System.out.println(str));
    }

}
