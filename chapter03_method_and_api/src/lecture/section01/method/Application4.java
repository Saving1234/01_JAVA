package lecture.section01.method;

public class Application4 {

    public static void main(String[] args) {

        /*
        메소드의 return (반환)
        return : 현재 메소드를 종료하고 호출한 구문으로 돌아가라는 명령.
         */

        Application4 app4 = new Application4();

        String str = app4.sayHello();

        System.out.println(str);

    }

    public void testMethod(){
        System.out.println("테스트 동작 확인");

        return; //여기서 종료 후 호출한 곳으로 돌아가라.

        //System.out.println("테스트 동작 확인");
    }

    public String sayHello(){

        String sayHello = "Hello";

        return "안녕";
    }

}
