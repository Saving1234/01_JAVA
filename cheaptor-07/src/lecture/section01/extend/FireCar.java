package lecture.section01.extend;

public class FireCar extends Car{

    public FireCar() {

        super();

        System.out.println("FireCar의 기본생성자 호출 ...");

    }

    //메소드
    public void sprayWater(){

        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다 -->");

    }

    //오버라이딩


   @Override
    protected boolean isRunning() {
        return super.isRunning();
    }
   @Override

    public void soundHorn() {

        //주행 중일 때만 경적.
        if (isRunning()) {
            System.out.println("빠아아아아앙~~!");
        } else {
            System.out.println("주행중이 아닐 경우 경적을 울릴 수 없습니다");
        }


    }





}
