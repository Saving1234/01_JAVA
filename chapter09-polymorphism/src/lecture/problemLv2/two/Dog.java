package lecture.problemLv2.two;

public class Dog extends Animal{
    //품종.
    String breed;

    public Dog() {
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed=breed;
    }

    @Override
    public void printInfo() {
        System.out.println("Dog 생성자 호출 : " + name);
        System.out.println("이름 : " + name + "품종 : " + this.breed);
    }

}