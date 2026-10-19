package lecture.section02.userexception;

import lecture.section02.userexception.exception.NotEnoughMoneyException;
import lecture.section02.userexception.exception.PriceNegativeException;
import lecture.section02.userexception.exception.MoneyNegativeExceptions;

//THROW는 던져야할 곳이 있어야 던짐.
//TRY로 검증해도 되고.
//둘 다 없으면 컴파일 오류.

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeExceptions,NotEnoughMoneyException {


        if(price < 0){
            throw new PriceNegativeException("PriceNegativeException 발생!");
        }

        if(money < 0){
            throw new MoneyNegativeExceptions("PriceNegativeException 발생!");
        }

        //price가 money 보다 작은지? 예외문.

        if(price < money){
            throw new NotEnoughMoneyException("돈이 부족합니다!");
        }

    }


}
