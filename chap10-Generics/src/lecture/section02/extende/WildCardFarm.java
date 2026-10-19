package lecture.section02.extende;

public class WildCardFarm {
    public static void superType() {
    }

    // RabitFarm 의 제네릭 타입이 뭐든 매개변수로 받겠다는 의미. ?.

    public void anyType(RabbitFarm<?> farm){

        farm.getAnimal().cry();
    }


    // Rabbit을 부모로 가진 자식클래스, bunny는 전부 매개변수로 올 수 있다.
    public void extendType(RabbitFarm<? extends Bunny> farm){

        farm.getAnimal().cry();
    }

    //bunny이거나 bunny 윗 부모만 가능.
    //단, Rabbit으로 extend 제약을 걸었기에, rabbit 한정?
    public void superType(RabbitFarm<? super Bunny> farm) {

    }

}
