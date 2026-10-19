package lecture.section02.superkeyword;

public class Application {

    public static void main(String[] args) {

        //super : 현재 객체의 부모.
        //super() : 부모 클래스의 생성자 호출.

        //기본생성자 호출.
        //객체 생성안해도 호출?!!
        System.out.println("====1. 매개변수가 있는 super()===");
        new Computer();

        System.out.println("====2. 매개변수가 있는 super()===");
        Computer computer = new Computer(

                "S-01234", "삼성", "갤럭시폴드6", 2398000, new java.util.Date(),
                "퀄컴 스냅드래곤", 512, 12, "안드로이드"
        );


        System.out.println("===3. 부모 메서드 호출 ===");
        System.out.println(
                computer.toString());

    }

}
