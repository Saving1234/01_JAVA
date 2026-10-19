package lecture.section02.extende;

//제네릭에 제약.
//제약하고 싶은 범위를 extends 써서 제약하 클래스 넣기.
//타입 제약이기에 extends

public class RabbitFarm <T extends Rabbit >{

        //필드
    private T animal;

    //생성자.
    public RabbitFarm(){}


    public RabbitFarm(T animal) {
        this.animal = animal;
    }
    //getter/setter
    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
