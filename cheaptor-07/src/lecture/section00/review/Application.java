package lecture.section00.review;

public class Application {

    public static void main(String[] args) {

        Person person = new Person("영찬", 31);
        // 다른 생성자가 없을 때, 컴파일러가 자동 생성자 생성.
        Person person2 = new Person();
        Application app = new Application();

        person.introduce();
        person.toString();

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }

    public void testMethod(){
        System.out.println("dd");
    }



}





