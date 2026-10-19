package lecture.section02.math;

public class Application1 {

//math 클래스 -> 수학에서 자주 사용하는 상수, 함수들을 미리 구현해놓은 클래스.

//import java.lang.* 이 자동으로 탑재. lang을 너무 많이 써서.
    public static void main(String[] args) {

        //절댓값

        System.out.println("-7의 절대값" + Math.abs(-7));



        //최소값
        System.out.println(Math.max(1,4));
        System.out.println(Math.min(4,7));

        //변하지 않는 상수.
        System.out.println(Math.PI);

        //랜덤함수. 난수
        //실수

        System.out.println(Math.random());

        //1~10까지의 난수

        int random = (int) (Math.random()*10+1);
        System.out.println("random = " + random);

    }

}
