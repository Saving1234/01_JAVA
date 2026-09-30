package lecture.section01.literal.section04.typecasting;

public class Application1 {

    public static void main(String[] args) {
        //자동 형변환.
        //값의 범위를 넓히는 반환은 컴파일러가 자동으로 처리해준다.
        // 서로 다른 숫자형을 연산할 때 -> 더 큰 자료형으로 변환.

        byte bnum =1;
        short snum =bnum;
        int inum = bnum;

        System.out.println(inum);

        int num1 =10;
        long num2 = 20;

        long result = (long)(num1 + num2); //long도 같이 넣으니까 , 값이 커져버림.
        int result2 = (int) (num1 + num2); //

    }

}
