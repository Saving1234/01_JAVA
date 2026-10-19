package lecture.section00.review;

//클래스의 기본 구조.
//클래스. 객체를 만들기 위한 설계도(참조자료)
public class Person {

   private String name;
   private int age;






    public Person() {
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //현재 말들어진 객체(인스턴스) 자기 자신을 가리킴.

    public void introduce(){
       System.out.println(
               "안녕하세요 저는 " + name + "이고, " + age + "살 입니다.");

   }

//getter 데이터 읽는. 가져오는.
    public String getName() {
        return name;
    }
//setter 데이터 수정. 설정.
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; //전처리.
    }


}
