package exercise.problem02;

import java.util.Scanner;

public class Answer1 {

    /*
     * 문제 3. 사칙연산 계산기
     *
     * problem03 패키지의 Answer 클래스에서 java.util.Scanner를 import하고
     * Scanner 타입의 scanner 객체를 생성한다.
     * 첫 번째 정수 20을 firstNumber에, 두 번째 정수 5를 secondNumber에 nextInt로 입력받는다.
     * 두 정수를 매개변수로 받아 각각 덧셈, 뺄셈, 곱셈, 나눗셈 결과를 반환하는 non-static 메서드
     * add, subtract, multiply, divide를 작성한다. divide의 반환 타입은 double로 작성한다.
     * Answer 타입의 calculator 객체로 네 메서드를 호출하고 결과를 additionResult,
     * subtractionResult, multiplicationResult, divisionResult에 각각 저장한다.
     * secondNumber에는 0이 아닌 값을 입력하며, 조건문과 반복문은 사용하지 않는다.
     * 입력 안내 문구와 계산 결과를 아래 형식으로 출력한다.
     *
     * 실행 결과
     * 첫 번째 정수 입력 : 20
     * 두 번째 정수 입력 : 5
     * 덧셈 결과 : 25
     * 뺄셈 결과 : 15
     * 곱셈 결과 : 100
     * 나눗셈 결과 : 4.0
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Answer1 num = new Answer1();

        System.out.println("첫번째 숫자:");
        int firstNumber = sc.nextInt();

        System.out.println("firstNumber = " + firstNumber);
        System.out.println();

        System.out.println("두번째 숫자");
        int secondNumber = sc.nextInt();

        System.out.println("덧셈 :" + num.add(firstNumber,secondNumber));
        System.out.println("뺄셈 : " + num.subtract(firstNumber,secondNumber));
        System.out.println("곱셈 : " + num.multiplication(firstNumber,secondNumber));
        System.out.println("나눗셈 : " + num.division(firstNumber,secondNumber));

        

    }

    public int add(int x, int y){

        int additionResult = x+y;

        return additionResult;

    }

    public int subtract(int x, int y){

        int subtractionResult = x-y;

        return subtractionResult;

    }

    public int multiplication(int x, int y){

        int multiplicationResult = x*y;

        return multiplicationResult;

    }


    public double division(int x, int y){

        int divisionResult = x/y;

        return divisionResult;

    }



}
