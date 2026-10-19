package lecture.section01.comparisonn;

public class Application {
    public static void main(String[] args) {

        /*
        비교 연산자
        - 두 값을 비교해서 boolean 값을 반환.
        == : 같냐? != 다르냐? < : 작냐? >: 커?
         */

        int num1 = 10;
        int num2 = 20;

        System.out.println("num2 == num1 :" + (num2==num1));
        System.out.println("num2 != num1 :" + !(num2 != num1)); // 값 앞에 ! 넣으면 전체가 !로 바뀜

        // num 1이 num2 보다 큰가?
        System.out.println("num2 = " + (num1> num2));
        System.out.println("num2 = " + (num1 < num2));

    }

}
