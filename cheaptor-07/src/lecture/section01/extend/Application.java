package lecture.section01.extend;

public class Application {

    //상속
    /*
       부모 클래스가 가지고 있는 멤버를 자식 클래스가 물려받음.
       모든 클래스가 object(최상위 부모클래스)를 상속받은 클래스.


       상속 사용방법


      매소드 재정의(overRiding)
      부모의 메소드를 그대로 사용하면서 자식 클래스에서 정의한대로 동작하도록 구현.
      재정의한 메소드가 우선적으로 동작.

      상속은 부모의 모든 걸 받으기에, 필요없는 기능도 받게 됨.
      상속이 정답은 아님.
     */

    public static void main(String[] args) {
        //Car car = new Car();
        //Car car = new Car();

        // 변수명은 부모 클래스와 같게.
        //상속하면 부모의 모든 걸 가지고 온다.
       // FireCar car = new FireCar();
        RacingCar caro = new RacingCar();

        //부모쪽 기능들.

        //car.soundHorn();
       // car.run();
       // car.soundHorn();

        //자식 추가한 기능.
        //car.sprayWater();

        //racingCar 추가한 기능.
        caro.run();
        caro.soundHorn();
        caro.stop();


    }

}



