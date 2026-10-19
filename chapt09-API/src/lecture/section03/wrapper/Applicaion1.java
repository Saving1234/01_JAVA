package lecture.section03.wrapper;

public class Applicaion1 {

    public static void main(String[] args) {

        /*
        Wrapping class
            기본 자료형을 객체로 감싸주는 클래스 (byte, short, int, long, float 등)
            Integer 등. 메소드를 호출해 기능 내기?
         */


        int primitive = 20;

        Integer wrapper = primitive; //Auto Boxing
        int result = wrapper; // Auto Unboxing

        //서로 맞는 타입이면 자동으로 바뀜.

        //parse() : 해당 타입의 문자열을 인자로 받아서 원하는 타입으로 변환.

        //문자열을 int로.
        //더블도.
        //스트링만 value of.

        int age = Integer.parseInt("20");
        boolean boo = Boolean.parseBoolean("134.2");

        System.out.println(age);
        System.out.println(!boo); //boolean은 입력된 값이 문자열이라 false 이기에 ! 넣을 것.





    }

}
