package lecture.section02.variable;

public class Application1 {

    public static void main(String[] args) {
        System.out.println(11);

        int age = 20;

        /*
        1. 코드의 의도가 분명해진다.
        2. 한번 저장한 값을 재사용 할 수 있다.
         */

        int bonus = 200000;
        int salary = 500000;

        System.out.println("보너스를 포함한 급여 :" + (bonus+salary));

    }
}
