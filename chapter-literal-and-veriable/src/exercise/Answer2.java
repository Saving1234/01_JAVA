package exercise;

public class Answer2 {

    /*
     * chap01 literal_and_variable 연습문제
     *
     * 각 문제는 별도의 클래스와 main 메서드를 만들어 해결한다.
     * 출력 결과를 그대로 문자열로 작성하지 말고 문제에서 요구한 리터럴, 변수,
     * 상수, 형변환을 사용한다.
     */



    /*
     * 문제 2. 자기소개 정보 저장
     *
     * 다음 정보를 저장할 수 있는 적절한 자료형의 변수를 선언하고 값을 대입한다.
     * - 이름: 홍길동
     * - 나이: 20
     * - 키: 175.5
     * - 학점: A
     * - 재학 여부: true
     *
     * 실행 결과
     * 이름 : 홍길동
     * 나이 : 20세
     * 키 : 175.5cm
     * 학점 : A
     * 재학 여부 : true
     */

    public static void main(String[] args) {

        String name = "홍길동";
        int age = 20;
        double tall = 17.5;
        char score = 'A';
        boolean School = true;
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + tall);
        System.out.println("학점 : " + score);
        System.out.println("재학 여부 : " + School);

    }





}


