package lecture.section02.string;

public class Application2 {


    //String Pool
        /*
          Heap 메모리 중에 특수한 공간, 리터럴 형태로 생성된 문자열을 관리.
          @@동일한 문자열@@이 존재할 경우에 같으느 인스턴스를 재사용해 메모리 사용을 최적화.

         */

    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "java";

        System.out.println("str1==str2 : " + (str1 ==str2)); // 주소값 비교
        System.out.println("str1.eqals(strs) : " + (str1.equals(str2))); //값 비교


        //String Pool 때문에 같은 문자열이면 다 true로 됨.

        String str3 = new String("java"); //따로 공간 만들고 싶으면 new.
        System.out.println("str1==str3 : " + (str1 ==str3)); // 주소값 비교

        //값 자체를 비교. equals.!!

        /* 문자열의 값 자체를 비교.
        String 클래스의 equals는 문자열 값 비교하도록 오버라이딩 되어있음.


         */


    }
}
