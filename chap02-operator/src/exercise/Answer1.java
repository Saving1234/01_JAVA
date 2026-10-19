package exercise;

public class Answer1 {

    /* 각 문제는 별도의 클래스와 main 메서드를 만들어 해결한다.
            * 아직 배우지 않은 조건문(if, switch)은 사용하지 않고 연산자를 이용한다.
            * 먼저 실행 결과를 예상한 뒤 코드를 작성하고 실행한다.
            */

    /*
     * 문제 1. 초를 분과 초로 변환
     *
     * totalSeconds 변수에 125를 저장한다.
     * / 연산자로 분을 계산하고 % 연산자로 남은 초를 계산한다.
     * 계산한 결과는 각각 minutes와 seconds 변수에 저장한다.
     *
     * 실행 결과
     * 125초는 2분 5초입니다.
     */


    public static void main(String[] args) {

        int totalSecond = 125;

        int minute = 125/60;
        int seconds = 125%60;

        //출력
        System.out.println(totalSecond + "초는" + minute + "분" + seconds + "초입니다.");
    }

}
