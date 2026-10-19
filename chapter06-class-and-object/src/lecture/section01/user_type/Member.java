package lecture.section01.user_type;

//회원 클래스
//new를 써야 jvm에 올라감.

import java.util.Arrays;

public class Member {

     // 사용자 id, password, name, age, gender, hobby
    // 필드 / 인스턴스변수/ 속성이라고도 불림.
    String id;
    String password;
    String name;
    int age;
    char gender;
    String [] hobby;


    //주소가 출력되는 것이 아니라 필드들을 나열해서 볼 수 있다.
    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
