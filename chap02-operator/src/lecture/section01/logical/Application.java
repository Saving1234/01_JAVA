package lecture.section01.logical;

public class Application {

    public static void main(String[] args) {

        /*
        논리연산자

        논리 값을 다루는 연산자.
        && : 두 조건이 모두 true 일 때만 true (and 연산)
        || : 두 조건 중 하나라도 true이면 true (or 연산)
        ! : 논리값을 반대로 변경
         */

                System.out.println("true와 true의 논리 and 연산 :" + (true && true));
                System.out.println("true와 true의 논리 and 연산 :" + (true && false));

                System.out.println("true와 true의 논리 and 연산 :" + (true || true));
                System.out.println("true와 true의 논리 and 연산 :" + (true || false));

        System.out.println("==============================");
        //성인이면서 타겟이 있는가?

        int age = 20;
        boolean hasTicket = true ;

        boolean result = age >= 20 && hasTicket;
        System.out.println("성인이면서 타겟이 있는가?"+ result);

        //평균 80점 이상, 출석률 90% 이상, 징계이력이 없어야 장학금 대상이다.

        int averageScore = 88; //평균
        int attendanceRate = 95; // 출석률
        boolean hasRecord = false; //장학금 대상

        boolean result2 = averageScore >= 80 && attendanceRate >= 90 && !hasRecord;
        System.out.println("학생의 조건은 장학금 대상인가?"+ result2);




    }
}


