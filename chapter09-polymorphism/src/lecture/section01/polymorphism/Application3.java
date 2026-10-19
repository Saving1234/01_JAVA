package lecture.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {

    }

    //클래스를 매개 변수로도 활용이 가능.
    public static void feed(Animal animal){
        Tiger tiger = new Tiger();


        feed(tiger);
        //feed(rabbit);


        animal.eat();
    }

    //return의 다형성.
    public static Animal getTandomAnimal(){

        int random = (int) (Math.random()*2);
        return random == 0? new Tiger() : new Rabbit();

    }

}
