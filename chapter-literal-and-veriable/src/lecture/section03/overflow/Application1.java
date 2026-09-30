package lecture.section03.overflow;

public class Application1 {

    public static void main(String[] args) {
        //자료형마다 표현할 수있는 범위가 있는데 범위를 넘어설 경우

        byte num1 = 127;

        System.out.println("증가 전 :"+ num1);
        num1++; //num에 +1을 한 것.
        System.out.println(num1); //overflow  . 127까지 표현하는 byte. 더 이상 표현할 수 없으니 -로 표현.

        int inum = 1000000;
        int inum2 = 50000000;
        System.out.println(inum*inum2);


        //이미 int *int이기에 이미 -임.

        long devin = (long)inum * inum2;  //형변환. (long) 넣어 자료형 변환시킴.
        System.out.println(devin);

    }

}
