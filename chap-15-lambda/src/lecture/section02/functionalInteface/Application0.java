package lecture.section02.functionalInteface;


import java.time.LocalDateTime;
import java.util.function.*;

//
public class Application0 {

    //추상메서드 구현하는 방법.
    //미리 만들어놓은 람다식 인터페이스 api 가져와 쓰는 것.

    /*
     * 표준 함수적 인터페이스
     * Runnable : 매개변수 X, 리턴값 X : run()
     * Consumer : 매개변수 O, 리턴값 X : accept()
     * Supplier : 매개변수 X, 리턴값 O : get()
     * Function : 매개변수 O, 리턴값 O : apply()
     * Operator : 매개변수 O, 리턴값 O : apply() * 매개변수와 Return 타입이 동일
     * Predicate: 매개변수 O, 리턴값 O : test() * Boolean값을 리턴
     *
     * 함수형 인터페이스 어노테이션을 굳이 붙이지 않아도 됨.
     * 여기에 다 들어가있음.
     * */

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a,b)-> a+b;
        System.out.println(binaryOperator.apply(5,4));

        //Runnable

        Runnable runnable = () -> System.out.println("실행");
        runnable.run();

        Consumer<String> consumer = (str) -> System.out.println(str);
        consumer.accept("Consumer 실행");

        //리턴값.
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        //앞은 T. 타입. 매개변수
        //뒤는 R. 반환형. 반환형 타입.
        Function<String, Integer> function = (str) -> {return Integer.parseInt(str);}; //한줄만 있을 땐 중괄호 빼도 됨.
        System.out.println(function.apply("50")+5);

        //Boolean 있음.
        Predicate<Integer> isEven = n -> n%2 ==0;
        System.out.println(isEven.test(5));

    }
}
