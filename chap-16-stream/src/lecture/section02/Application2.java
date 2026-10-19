package lecture.section02;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Application2 {

    public static void main(String[] args) {

        /*/
          Stream<T> filter(Predicate <? super T> predicate)
          스트림에서 특정 데이터만 걸러내는 메소드

          map은 function. (funtion<? super T , ?

          스트림에 들어있는 데이터를 특정 람다식을 통해 데이터를 가공하고,
          새로운 스트림에 담아줌.
         */



        IntStream intStream = IntStream.range(0,10);
        intStream
                .filter((i) -> (i%2) ==0) //짝수만 다음
                .map(i -> i*5)
                .forEach(System.out::println);

        IntStream intStream2 = IntStream.range(0,10); //이건 뭘 의미하는 건지.
        intStream2
                .filter((i) -> (i%2) ==0) //짝수만 다음
                .mapToDouble(i -> i*5)  //타입도 바꿔줄 수 있긴 함.
                .forEach(System.out::println);
    }

}
