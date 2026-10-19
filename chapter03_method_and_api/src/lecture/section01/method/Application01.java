package lecture.section01.method;

public class Application01 {






    //메인 매서드
    public static void main(String[] args) {

        System.out.println("main 메서드 실행됨...");

        //메서드 객체 생성
        Application01 app1 = new Application01();


        //메서드 호출
        app1.methodA();
        app1.methodB();
        app1.methodC();

        System.out.println("main 메서드 종료됨...");

    }



    public void methodA() {

        System.out.println("methodA() 호출됨...");

        return;

    }

    public void methodB() {

        System.out.println("methodB() 호출됨...");

        return;

    }

    public void methodC() {

        System.out.println("methodC() 호출됨...");

        return;

    }

}


