package lecture.section01.method;

public class Application6 {

    // static method 방법
    // 타 클래스에 호출하려면 클래스명. method 명().



    public static void main(String[] args) {

        System.out.println(sum(5,6));
        //sysyem. out 클래스 명. print
        //ctrl , 클릭해보면 정보 나옴.

    }

    public static int sum(int x, int y){

        return x+y;
    }

    public static int minus(int x, int y){

        return x-y;
    }



}
