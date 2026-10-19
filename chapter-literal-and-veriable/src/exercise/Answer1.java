package exercise;

public class Answer1 {

    /*
     * chap01 literal_and_variable 연습문제
     *
     * 각 문제는 별도의 클래스와 main 메서드를 만들어 해결한다.
     * 출력 결과를 그대로 문자열로 작성하지 말고 문제에서 요구한 리터럴, 변수,
     * 상수, 형변환을 사용한다.
     */

    /*
     * 문제 1. 여러 종류의 리터럴 출력
     *
     * 다음 값을 알맞은 형태의 리터럴로 직접 출력한다.
     * - 문자열 Java
     * - 정수 100
     * - 실수 3.14
     * - 문자 A
     * - 논리값 true
     *
     * 실행 결과
     * Java
     * 100
     * 3.14
     * A
     * true
     */


    public static void main(String[] args) {

        String Java = "Java";
        int num = 100;
        double num2 = 3.14;
        char ch = 'A';
        boolean bool = true;

        //출력

        System.out.println("Java = " + Java);
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
        System.out.println("ch = " + ch);
        System.out.println("bool = " + bool);

    }

}
