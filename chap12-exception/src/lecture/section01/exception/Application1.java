package lecture.section01.exception;

public class Application1 {

    public static void main(String[] args) throws Exception {

        /*
            예외처리.
            1. throw(호출 한 곳으로 보내는)
            2. try -catch로 처리.
         */

        ExceptionTest et = new ExceptionTest();

        et.checkEnoughMoney(1000, 50000);
        et.checkEnoughMoney(55000, 1000);//예외 여기에서 받아 메서드의 throw로 보냄.

        //예외 발생으로 출력 안됨.
        System.out.println("프로그램 종료");
    }

}
