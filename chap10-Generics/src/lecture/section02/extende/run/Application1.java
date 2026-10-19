package lecture.section02.extende.run;


import lecture.section02.extende.Animal;
import lecture.section02.extende.Mammal;
import lecture.section02.extende.Rabbit;
import lecture.section02.extende.RabbitFarm;

   /*
            extends 키워드를 사용하면 특정 타입만 사용하도록 제한.
         */

//상속 이용하여 제한.
//extends로 Animal 제약 걸었으니.
public class Application1 {

    public static void main(String[] args) {
       // RabbitFarm<Animal> farm1 =  new RabbitFarm<>();

        RabbitFarm<Rabbit> farm2 = new RabbitFarm<>();




    }
}
