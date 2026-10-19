package lecture.section01.user_type;

public class Application {

    public static void main(String[] args) {

        //클래스 객체 생성
        //인스턴스 생성. -> heap 안에 들어감. -> 주소값 -> stack (member)에 들어감.
        Member member = new Member();

        //null : 비어있는 값을 표현하는 의미.
        /*
        필드에 접근하기 위해서는 변수명, 필드명으로 접근.
        '.' : 참조연산자 => 변수가 참고하고 있는 주소로 접근하는 의미를 가짐.
         */

        System.out.println(member);

        System.out.println("member.id = " + member.id);
        System.out.println("member.id = " + member.name);
        System.out.println("member.id = " + member.password);
        System.out.println("member.id = " + member.age);


        member.id="";
        member.password="";
        member.name="";
        member.age= 0;
        member.gender=' ';
        member.hobby = new String[] { };

        //alt + j 커서복사
        //ctrl + d 줄복사

        System.out.println("member.pwd " + member.password);
        System.out.println("member.gender " + member.gender);




        Member member2 = new Member();





    }

}
