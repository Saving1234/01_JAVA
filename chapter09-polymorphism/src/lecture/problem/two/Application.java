package lecture.problem.two;

public class Application {

    public static void main(String[] args) {



        Animal []animal1 = {new Animal(), new Dog()};

        for(Animal animals : animal1 ){
            animals.makeSound();
        }

    }

}
