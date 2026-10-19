package lecture.section02.extende.run;

import lecture.section02.extende.*;

public class Application2 {

    public static void main(String[] args) {
        //와일드 카드 : [?]
        // <?> : 제한없음. 이라는 의미.
        // <? extends TYPE> : 와일드카드의 상한 제한 (TYPE과 TYPE의 후손으로만 사용 가능)
        // <? super TYPE> : 와일드카드의 하한 제한 (TYPE과 TYPE의 부모로만 사용 가능)

        WildCardFarm wildCardFarm = new WildCardFarm();

        //anytype(Rabbit<?> farm)
        // 어떤 토끼든 생성이 가능. ? 썼으니까.

        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>());



        //extends 타입
        //extends Type(RabbitFarm <? estends Bunny> farm)
        // Bunny의 상위타입으로 만든 토끼만 가능.

        //Bunny의 자식으로 만든 토끼만 가능.
        wildCardFarm.extendType(new RabbitFarm<>(new Bunny()));

       // wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        

    }

}
