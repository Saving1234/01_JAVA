package lecture.section02.package_and_import;

import lecture.section01.method.Calculator;

     /*
     패키지
     서로 관련있는 클래스 등을 모아 하나의 그룹으로 구성하는 것을 의미.
      */

//패키지 안에서는 같은 이름의 클래스 불가.
//

public class Application1 {

    public static void main(String[] args) {

        int result =  lecture.section01.method.Calculator.sum(10,10);

        System.out.println(result);

        lecture.section01.method.Calculator calculator = new  lecture.section01.method.Calculator();


        int result2 = calculator.minus(10,5);


    }



}
