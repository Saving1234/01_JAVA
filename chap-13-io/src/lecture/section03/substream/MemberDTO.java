package lecture.section03.substream;

import java.io.Serializable;

//DTO. 캡슐화. GETTEER/SETTER. 생성자. tostring
//인스턴스 형태로 못내보냄. 문자열 형태로 보내야함. byte 형태로.
//직렬화.

//객체 입출력 위해서는 Serializable 이라는게 있어야함. 직력화 처리 해야해서.
public class MemberDTO implements Serializable{

    //특정 필드를 직렬화에서 제외한느 키워드
    //transient
    private String id;
    private String pwd;
    private String name;
    private String email;
    private int age;
    private char gender;

    //직렬화에서 제외.
    private  transient double point;

    public MemberDTO(){}

    //필드
    public MemberDTO(String id, String pwd, String name, String email, int age, char gender, double point) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }

    //GETTER/Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    //toString

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", point=" + point +
                '}';
    }
}
