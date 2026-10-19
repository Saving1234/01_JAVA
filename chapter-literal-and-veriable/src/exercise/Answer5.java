package exercise;

public class Answer5 {

    /* 문제 5. 형변환을 이용한 평균 계산
     *
             * 국어 80점, 영어 75점, 수학 90점을 int 변수에 저장한다.
     * 총점을 int 변수에 저장하고, 평균이 실수로 나오도록 명시적 형변환을 사용한다.
            * 문자 'A'를 char 변수에 저장한 뒤 int로 자동 형변환하여 유니코드 값을 출력한다.
            *
            * 실행 결과
     * 총점 : 245
            * 평균 : 81.66666666666667
            * A의 유니코드 값 : 65


*
     */

    public static void main(String[] args) {

        int 국어 = 80;
        int 영어 = 75;
        int 수학 = 90;

        int Raise = 국어 + 영어 + 수학;
        double Average = 국어+영어+수학 / 3;
        char A = 'A';

        //출력
        System.out.println(Raise);
        System.out.println(Average);
        System.out.println((int) 'A');


    }

}
