package lecture.section03;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car car = new Car();
        car.startUp(); //시동걸기
        car.go(); // 속도올리기
        car.stop(); // 정지하기
        car.turnOff(); //사동끄기

        //자동차 객체
        Car car1 = new Car();

        //자동차 운전자
        CarRaser carRaser = new CarRaser();


        carRaser.setCar(car);

        carRaser.startUp();

        while(true) {
            System.out.println("======== 카레이싱 프로그램 ==========");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch(no) {
                case 1 : carRaser.startUp(); break;
                case 2 : carRaser.stepAccelator(); break;
                case 3 : carRaser.stopBreak(); break;
                case 4 : carRaser.turnOff(); break;
                case 9 : System.out.println("프로그램을 종료합니다."); break;
                default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
            }

            if(no == 9) {
                break;
            }
        }

    }

}
