package lecture.section01.intro;

public class Applicaion1 {

    public static void main(String[] args) {
        //람다 표현식.
        //(매개변수, ...) -> {...}   : 메소드 표현 방법.
        // 매개변수 타입은 추론이 가능해서 명시적으로 작성 안함! 해도 되고.
        // 매개변수가 한개만 있을 땐 ()를 생략 가능.  ex) str -> {}
        // 실행문이 한줄일 경우 {}도 생략 가능 ex) str -> 실행문.

        //람

        //1. 인터페이스를 구현한 구현체(클래스)를 이용한 방식
        CalculatorImpl calculator = new CalculatorImpl();
        System.out.println(calculator.sumTwoNumber(5,4));


        //2. 익명 클래스
        Calculator calculator2 = new Calculator() {
            @Override
            public int sumTwoNumber(int a, int b) {
                return a + b;
            }

        };   //파라미터가 있어야 함. 일회성으로 사용. 코드가 잘 안보여서 잘 사용은 안함.

        //3. 람다식.
        //부모와 같은 형식으로.
        //1~3번 다 같은 형식.  //인터페이스 매번 만들긴 그러니까 함수형 인터페이스를 만들기도 한다.

        Calculator calculator3 = (x, y) ->  x+y;  //원래는 {return x+y;}; //람다식으로 선언. 호출은 아님.
        System.out.println("람다식 동작");
        System.out.println(calculator3.sumTwoNumber(5,4));
    }

}
