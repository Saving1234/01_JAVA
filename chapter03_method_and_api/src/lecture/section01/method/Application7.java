package lecture.section01.method;

public class Application7 {

    public static void main(String[] args) {

        
        //static method 는 호출할 때 클래스명 작성.
        
        int result = Application6.sum(5,6);
        System.out.println("result = " + result);

        //non static 방법.
        // 객체 생성.

        Application6 app6 = new Application6();
        int result1 = app6.minus(5,6);
        System.out.println("result1 = " + result1);
    }

}
