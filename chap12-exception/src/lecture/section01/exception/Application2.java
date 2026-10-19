package lecture.section01.exception;

public class Application2 {

    public static void main(String[] args)  {

        /*
            예외처리.
            1. throw(호출 한 곳으로 보내는)
            2. try -catch로 처리.
         */

        ExceptionTest et = new ExceptionTest();


        try {
            et.checkEnoughMoney(55000, 1000);//예외 여기에서 받아 메서드의 throw로 보냄.

            //예외가 발생하게 되면 바로 catch로 이동되기에 , try문 안에 코드는 실행되지 않음.
            System.out.println("checkEnoughMoney가 실행되었습니다.");
        } catch (Exception e) {

            //예외가 발생했을 때 동작할 처리
            System.out.println("예외 발생"+ e);

        }

        //예외 발생으로 출력 안됨.
        //예외가 try-catch문에 의해 출력되는게 확인.
        System.out.println("프로그램 종료");
    }
}
