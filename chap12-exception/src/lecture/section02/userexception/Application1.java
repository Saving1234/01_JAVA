package lecture.section02.userexception;

import lecture.section02.userexception.exception.MoneyNegativeExceptions;
import lecture.section02.userexception.exception.NagativeException;
import lecture.section02.userexception.exception.NotEnoughMoneyException;
import lecture.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {

        //호출하려는 곳에 메시지가 있을 때 , exception도 같이 출력하면 호출하는 곳의 메시지가 중복 출력. e에서도 출력. 또 출력.
        //메시지는 메인 메서드에서 할 것!!

        ExceptionTest et = new ExceptionTest();

        //스캐너도 외부 자원. 컴퓨터의 os -> Scanner -> jvm(키보드 입력).
        //스캐너 객체를 만들게 되면 sc,closed 같은 close문을 써서 반납하는 것.
        //try() : result문. 이건 자동으로 반납하게 해주는 것.

        try {
            et.checkEnoughMoney(10, 1000); //네거티브를 맨 아래에 있는 것은 부모라서? 부모가 먼저 체크되면 그걸로 끝나버려서?
        } catch (PriceNegativeException e) {
            System.out.println("Application1 PriceNegativeException e 발생 ");
            System.out.println(e.getMessage()); //예외에 대한 설명 작성할 때.
        } catch (MoneyNegativeExceptions e) {
            System.out.println("Application1 PriceNegativeException e 발생 ");
            System.out.println(e.getMessage()); //예외에 대한 설명 작성할 때.

        } catch (NotEnoughMoneyException e) {
            System.out.printf("\"NotEnoughMoneyException\" 문제 발생 %n%s%n" , e);
            System.out.println(e.getMessage()); //예외에 대한 설명 작성할 때.

        }catch (NagativeException e) {
            System.out.println("Application1 PriceNegativeException e 발생 ");
            System.out.println(e.getMessage()); //예외에 대한 설명 작성할 때.

        } finally {
            System.out.println("final 종료");
        }
        System.out.println("프로그램 종료");
    }
}
