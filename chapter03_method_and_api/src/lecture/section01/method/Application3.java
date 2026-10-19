package lecture.section01.method;

public class Application3 {


    public static void main(String[] args) {

        Application3 app3 = new Application3();


        int num = 20;

        //메소드에 매개변수가 있을 때에는 인자를 넣어주어야 함.
        app3.nam("홍길동", 27, '남'); // 호출한 매서드 값이 인자. //인자의 갯수는 매개변수의 갯수와 같아야함.



        System.out.println("종료");


    }

/*
    매개변수(parameter) & 전달인자 (argument)
     */


    /*
    사용자의 이름, 나이, 성별을 받아서 출력하는 메소드
    메소드 명은 자유
    이름 문자열
    나이 저우형
    성별 문자 (남, 여)
     */

    public void nam(String name, int agen, char toildet){

        System.out.println(name + "은 " + agen + "살이고 " + toildet + " 입니다.");

        System.out.println("이름 :" + name);
        System.out.println("나이 : " + agen);
        System.out.println("성별 : " + toildet);

    }




}


