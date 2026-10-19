package lecture.section01.conditional;

import lecture.section02.looping.B_while;

//실행시키는 용도.
public class Application {



    public static void main(String[] args) {

        //A 클래스
        A_if A = new A_if();
       // A.testSimpleIf();

        //b 클래스
        B_if_elseif b = new B_if_elseif();
        //b.testSimpleIf();

        //C 클래스

        C_switch c = new C_switch();
        //c.calculatorWithSwitch();
        c.calculatorWithSwitch2();

        B_while bin = new B_while();
        bin.sampleWhile();



    }


}
