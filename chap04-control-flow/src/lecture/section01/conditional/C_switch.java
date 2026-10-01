package lecture.section01.conditional;

import java.util.Scanner;

public class C_switch {


    /*
    switch(비교할 변수) {
         case 비교값 1 : 비교값 1과 일치하는 경우 실행할 구문;
                     break;
         case 비교값 2 : 비교값 2과 일치하는 경우 실행할 구문;
                     break;
         case 비교값 3 : 비교값 3과 일치하는 경우 실행할 구문;
                     break;
        default : case에 모두 속하지 않는경우 실행할 구문
                     break;

                     값 자체를 비교한다!!!!
     */


    public void calculatorWithSwitch2(){

        //새로운 switch 문법.
        //가독성과 쓰기 좋음.

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요");
        int num1 = sc.nextInt();

        System.out.println("두번째 정수를 입력하세요");
        int num2 = sc.nextInt();


        System.out.println(

                """
                        원하는 연산기호의 숫자를 입력하세요
                        + : 1
                        - : 1
                        x : 3
                        / : 4
                        
                        입력 :
                       """
        );

        int op = sc.nextInt();

        switch (op) {
            case (1)  ->
                System.out.println("+ 연산 결과입니다 : " + add(num1,num2));
            case (2) ->
                System.out.println("+ 연산 결과입니다 : " + subtract(num1,num2));
            case (3) ->
                System.out.println("+ 연산 결과입니다 : " + multiply(num1,num2));
            case (4) ->
                System.out.println("+ 연산 결과입니다 : " + divide(num1,num2));
            default ->
                System.out.println("아무 케이스도 속하지 않는 경우 입니다.");
        }
    }



    public void calculatorWithSwitch(){

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요");
        int num1 = sc.nextInt();

        System.out.println("두번째 정수를 입력하세요");
        int num2 = sc.nextInt();


        System.out.println(

                """
                        원하는 연산기호의 숫자를 입력하세요
                        + : 1
                        - : 1
                        x : 3
                        / : 4
                        
                        입력 :
                       """
        );

        int op = sc.nextInt();

        switch (op) {
            case (1) : add(num1,num2);
                System.out.println("+ 연산 결과입니다 : " + add(num1,num2));
                break;
            case (2) : subtract(num1,num2);
                System.out.println("+ 연산 결과입니다 : " + subtract(num1,num2));
                break;
            case (3) : multiply(num1,num2);
                System.out.println("+ 연산 결과입니다 : " + multiply(num1,num2));
                break;
            case (4) : divide(num1,num2);
                System.out.println("+ 연산 결과입니다 : " + divide(num1,num2));
                break;
            default:
                System.out.println("아무 케이스도 속하지 않는 경우 입니다.");
                break;
         }
    }

    public int add(int x, int y) {

        return x+y;
    }

    public int subtract(int x, int y) {

        return x-y;
    }

    public int multiply(int x, int y) {

        return x*y;
    }

    public double divide(int x, int y) {

        return (double)x/y;
    }

}
