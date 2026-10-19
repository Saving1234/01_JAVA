package lecture.section07.kindsofbariable;

public class Kindsofvariable {

        private int glovalNum;
        private static int staticNum; //정적변수. 객체 없이 가능.


    public void testMethod(int arg){ //매개변수도 지역변수라, 메소드 안에서만 사용 가능.

        int localNum; //지역변수
    }

    public static void main(String[] args) {

       Kindsofvariable ki = new Kindsofvariable();
        System.out.print(staticNum);
        System.out.println(ki.glovalNum);
    }
}
