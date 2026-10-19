package lecture.section04.constructor;

public class User {

    private String id;
    private String pwd;
    private String name;

    //기본 생성자
    //컴파일러가 자동으로 만들어줌.
    //다만, 생성자를 만들 때엔 만들어주어야 함.

    //1. 인스턴스 생성 시점에 수행할 명령이 있을 때 사용.
    //2. 매개변수에 전달받은 값으로 인스턴스를 생성하고 싶을 때.


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

    public User(){
        System.out.println("User의 기본생성자 호출");
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public void test1(String id, String pwd){
        this.id=id;
        this.pwd=pwd;

    }

    public void test2(String name){
        this.name=name;
    }
}
