package lecture.section01.array;

public class Application2 {

    public static void main(String[] args) {

        //stack 영역에 만들기.
        int [] arr;
        char [] ca;

        //배열 공간 설정.
        //배열을 할당하여 대입 가능
        // new : heap 영역에 공간을 할당/ 주소값을 반환하는 키워드.
        //만든 주소를 stack 영역에 저장.
        // 주소를 참고하여 사용하기 때문에 참조자료형이라고 한다.
        arr= new int[10];
        ca= new char[10];

        //주소값
        //@a : 16진수

        //.이란? 참조연산자.

        //hashCode: heap 영역에 생성된 데이터를 고유한 정수값으로 확인할 때 사용
        //length : 배열의 길이. (10개면 10개)

        System.out.println("arr = " + arr.hashCode());
        System.out.println("ca = " + ca.hashCode());
        System.out.println("ca = " + ca.length);

        //배열 자체의 길이는 변경되지 않는다.
        //하지만 new를 쓰게 되면 또 heap영역에 배열을 만들게 된다.
        arr = new int[5];

        System.out.println("arr = " + arr.length);

        System.out.println("arr = " + arr.hashCode());


    }
}
