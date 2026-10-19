package lecture.section01.polymorphism;

//다형성.

public class Application1 {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.cry();
        Tiger tiger = new Tiger();
        tiger.cry();
        Rabbit rabbit = new Rabbit();
        rabbit.cry();


        //동적바인딩
        // 이 형식으로 진행되면, 컴파일 당시에는 해당 타입의 메소드를 가르키다가
        // 런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인이 바뀌어 동작.
        System.out.println();
        Animal a1 = new Tiger();
        a1.cry();
        //a1.bite();
        //컴파일이 안됨. aimal을 가리키고 있어, animal로 부터 상속받지 않은 메소드는 실행이 불가.
        Animal a2 = new Rabbit();
        a2.cry();
        Object a3 = new Tiger();

        System.out.println("======형변환======");
       ( (Tiger) a1).bite();
        ((Rabbit) a2).jump();

        System.out.println("instanceof 연산자");
        System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
        System.out.println("a2가  Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
        System.out.println("a2가  Tiger 타입인지 확인 : " + (a1 instanceof Animal));
        System.out.println("a2가  Tiger 타입인지 확인 : " + (a1 instanceof Object));
        //heap 영역에 있는 type이 맞는지 확인해주는 것.

        //tiger를 instance하여 if문으로 함.
        if(a1 instanceof Tiger){
            ((Tiger)a1).bite();
        }

        /*
           up-casting : 상위 탕비으로 형변환 -> 안써줘도 형변환이 가능
           down-casting : 하위 타입으로 형변환 -> 명시를 해주어야한다.
         */

        Animal animals = new Rabbit();


    }

}
