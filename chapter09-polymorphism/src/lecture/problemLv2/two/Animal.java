package lecture.problemLv2.two;

public class Animal {

    String name;

    public Animal(){

    }

    public Animal(String name) {
        this.name = name;
    }

    public void printInfo(){

        System.out.println("Animal 생성자 호출" + name);

    }

}
