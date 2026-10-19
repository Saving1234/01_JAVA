package lecture.section01.method;

public class Application2 {



    //메인 매서드
    public static void main(String[] args) {

        System.out.println("main 메서드 실행됨...");

        //메서드 객체 생성
        Application2 app1 = new Application2();


        //메서드 호출
        app1.methodA();


        System.out.println("main 메서드 종료됨...");

    }

    public void methodA() {

        System.out.println("methodA() 호출됨...");

        methodB();

        return;

    }

    public void methodB() {

        System.out.println("methodB() 호출됨...");

        methodC();

        return;

    }

    public void methodC() {

        System.out.println("methodC() 호출됨...");
        System.out.println("methodC() 종료됨...");


        return; //메서드 호출한 곳으로 돌아감.

    }

}
