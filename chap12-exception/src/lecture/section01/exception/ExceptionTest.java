package lecture.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("가지고 있는 돈은 " + money + "원입니다");

        if(money >=price){
            System.out.println("상품 구매 가능");

        } else{

            //강제 예외 발생.
            //개발할 때 검증으로?
            //throw 예외 인스턴스를 만들어 던지겠다 라는 의미.

                throw new Exception();
            }

             System.out.println("즐거운 쇼핑하세요");
    }



}


