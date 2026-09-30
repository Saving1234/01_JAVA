package lecture.section01.literal;

//리터럴 값 연산.

public class Application2 {

//정수끼리 연산.

    public static void main(String[] args) {

        //정수끼리 연산하면 정수의 결과값이 나온다
        System.out.println(12+34);
        System.out.println(12-34);
        System.out.println(12*34);
        System.out.println(12/34);
        System.out.println(12%34);

        //실수 연산.
        System.out.println("===== 실수가 포함된 연산 ====");
        System.out.println(10 / 4.0);
        System.out.println(0.1+0.2); //값이 정확하게 나오지 않는다. 10진수 -> 2진수로 변환하여 연산 못할 때가 있음.
        // 부동소수점
        //가장 가까운 근사값으로 저장해서 계산하게 됨. -> 그래서 오차가 생길 수 있음.


        //문자 연산
        //문자는 내부에서 숫자로 인식함.
        //이유는 컴퓨터는 숫자로만 인식하기에, 문자도 특정 숫자로 변환하여 인식.
        System.out.println('a'+'b');
        System.out.println('a'+1);

        //문자열\
        //문자 연산 안됨.

        System.out.println("===문자열 연산 ===");
        System.out.println("hello"+ "연산");
        System.out.println("hello"+ 100);
        System.out.println("hello"+ "hey");
        System.out.println("hello"+true);


    }

}
