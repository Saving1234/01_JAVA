package lecture.section01.generic;

//제네릭.

public class Application {

    public static void main(String[] args) {


        /*
          제네릭.
          1. 데이터 형식에 의존하지 않음
          2. 값이 여러 데이터 타입을 가질 수 있는 기술.
          3. 데이터 타입을 일반화 한다.
          4. <> : 타입 받는 곳. (list, map에도 나오니까.)
         */


        Generic<Integer> gt1 = new Generic<>(10);
        //이렇게 객체 생성해서 바꾸면 integer로 바뀜.,
        //제네릭은 무조건 참조형으로 전달. int, double 이런거 안됨. 대문자로 바꿔야함.

        System.out.println("gt1.getValue() = " + gt1.getValue());
        System.out.println("gt1.getValue() = " + (gt1.getValue() instanceof Integer)); //Integer타입이 맞는지.

        //String으로 타입 바꾸기.
        Generic<String> gt2 = new Generic<>("10");

        System.out.println("gt2.getValue() = " + gt2.getValue());
        System.out.println("gt2.getValue() = " + (gt2.getValue() instanceof String)); //Integer타입이 맞는지.


    }

}
