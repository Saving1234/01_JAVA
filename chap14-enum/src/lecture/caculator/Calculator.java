package lecture.caculator;


import static lecture.caculator.CalculatorErrorCode.DEVIDE_BY_ZERO;

//계산 메서드 모음 클래스.
public class Calculator {//컴파일러가 기본으로 생성자 생성.

private int num;

//생성자 하나 만들면 기본 생성자 안만들어준다.

    //double로 리턴.
    //double로 매개변수 두개 받아서 더해주는 메소드

    public double add(double firstNum, double secondNum){

        return firstNum + secondNum;

    }

    public double divide(double firstNum, double secondNum){

        if(secondNum ==0){
            throw new CalculatorException( DEVIDE_BY_ZERO);
        }





        //secondNumber 가 0이 입력된다면
        //DEVIDE_BY_ZERO하는 상수로 CalculatorException 발생시키기.
        // DEVIDE_BY_ZERO 정보
        // -code : CAL - 003
        // - message : "0으로 나눌 수 없음"

        return firstNum / secondNum;

    }


}
