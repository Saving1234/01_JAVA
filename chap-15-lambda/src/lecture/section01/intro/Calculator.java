package lecture.section01.intro;

//자바는 무조건 클래스가 있어야함.
//람다식은 인터페이스로 클래스를 대신.
//또는 객체 생성으로 써도 됨.

//자바는 메서드만 있어선 작동이 안됨.

//람다식으로 쓰려면 하나의 추상메서드만 있어야함.



    @FunctionalInterface  //함수적 인터페이스.
    public interface Calculator {

        //추상메서드.
        public int sumTwoNumber(int a, int b);
        //기능의 영향을 주는 것은 반환형/ 매개변수.
        //반환형을 제네릭으로 바꾸는 함수형
        //매개변수의 갯수, 반환이 될지 안될지.  (이걸 따라서 함수형인터페이스 api)

        //  public void printNum(int a);


    }

