package lecture.section01.logical;

public class Application4 {

    public static void main(String[] args) {
        
        /*
        상향 연산자
        조건식 ? [true 일 때 사용할 값] : [false일 때 사용할 값]
        
         */
        
        int num =10;
        
        boolean result = num > 0;
        
        //num이 0보다 크면 양수다 라고 콘솔에 출력하고
        // 0 또는 0보다 작으면 음수다라고 콘솔에 출력.
        //? ~인 경우
        // true인 경우 앞에 부분이 출력, false인 경우 뒷 부분이 출력 ("" : "")
        // 코드량 줄이고 싶거나 조건문이 복잡할 때?
        String result2 = num > 0 ? "양수다" : "음수다";
        System.out.println("result2 = " + result2);
        
        
        String result3=  num > 0 ? "양수다" : (num == 0) ? "0이다" : "음수다";
        //가독성이 안좋아서 상향연산자 중첩은 권장되지 않는다.


        /*
         * 점수에 따라 A,B,C 학점을 결정한다.
         * A 90점 이상
         * B 80점 이상
         * C 나머지 모두
         * 삼항연산자로 만들어보세요
         * */
        int score = 80; // B

        String resultln = score >= 90 ? "A" :
                score >= 80 ? "B" : "C";
        System.out.println(resultln);









        
    }

}
