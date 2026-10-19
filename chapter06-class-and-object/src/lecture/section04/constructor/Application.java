package lecture.section04.constructor;

public class Application {

    public static void main(String[] args) {

        //클래스명 변수 = new 생성자
        User user = new User();


        //User 클래스로인스턴스 만들 때
        /*
            원하는 필드들을 엏어야지만 인스턴스를 만들 수 있게 강제할 수 있음.
         */


        //User user2 = new User(); //기본생성자 사용.
        User user2 = new User("user01", "sfskfks", "dfsfsed");

        System.out.println(user2);

        User test1 = new User(); //id, pwd

        User test2 = new User();//name

    }

}
