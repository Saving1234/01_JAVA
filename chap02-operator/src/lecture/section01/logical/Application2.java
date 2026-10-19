package lecture.section01.logical;

public class Application2 {

    public static void main(String[] args) {

        // && / || 의 우선순위
        //일단 and가 먼저.

        boolean result1 = true || false && false;
        boolean result2 = (true || false) && false; //그러니 먼저 연산하고 싶은 것에 괄호를 칠 것.
        System.out.println("result2 = " + result2);
        System.out.println(result1);

        // 아래의 alpha 변수에 담긴 값이 알파벳인지 판별하는 코드를 작성하세요.
        char alpha = 'f';

        boolean answer= true; // 결과값이 알파벳이면 trun 또는 false가 나와야한다.


        //조건 작성

        answer = alpha >= 65 || alpha <= 122;



        char ab = 'a';
        char as = 'z';



        //char로 구성된 영어 문자열 숫자가 어떤 것인지 알아볼 것.
        //응용 문제 많이 풀어볼 것.
        System.out.println((int)'A');
        System.out.println((int)'z');
        System.out.println(answer);


        //f보다 크고 z보다 작은 숫자를 구하라.

        System.out.println((int) 'F');
        System.out.println((int) 'z');

        char alphab = 'G';

        boolean numTip = alphab >=70 || alphab <= 122;
        System.out.println("numTip = " + numTip);




    }

}
