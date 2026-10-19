package lecture.section03;

public class Car {

    //추상화 : 공통되는 부분만 추출하고, 나머지는 제거.

    //시동이 켜졌나.
    private boolean isOn;
    private int speed; //속도

    public void startUp(){

        if(isOn) {
            System.out.println("이미 시동이 걸려있습니다");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸겠습니다..");
        }

    }

    //시동이 걸렸을 때 속도를 10km/h 올리기

    public void go(){

        if(isOn){
            System.out.println("차가 앞으로 움직입니다");
            this.speed += 10;
            System.out.println("현재 차의 시속은" + this.speed + "입니다");

        }
    }

    //멈추기

    public void stop(){
        if(isOn){
            if(speed >0){
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈추세요");
            } else{
                System.out.println("이미 차가 멈춘 상태입니다.");
            }

            } else {
            System.out.println("차의 시동이 안걸려있습니다.");
        }
    }

    //시동끄기
    public void turnOff(){
        if(isOn){
            if(speed>0){
                System.out.println("달리는 차의 시동을 끌 수 없습니다");
            } else{
                this.isOn=false;
                System.out.println("시동을 끕니다");
            }
        }else{
            System.out.println("시동걸던가");

        }
    }

}
