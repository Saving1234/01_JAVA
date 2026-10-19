package practice.level2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

//        Pizza.values(); //상수를 담은 배열.
//
//
//
//
//        for(Pizza pizza : Pizza.values()){
//            System.out.println(pizza + ":" + pizza.getPrice());
//        }


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===신호등 점검기 입니다===");

            System.out.println("(빨간불, 노란불, 초록불) 원하시는 신호등을 적어주세요");
            String light= sc.nextLine();


         try {

             switch (light) {
                 case "빨간불":
                     throw new TraafficEnum(TrafficLight.RED); // TrafficEnum이리는 예외를 발생시키는 코드
                 case "노란불":
                     throw new TraafficEnum(TrafficLight.YELLOW);
                 case "초록불":
                     throw new TraafficEnum(TrafficLight.GREEN);
             }
         } catch (TraafficEnum e) { // TraafficEnum 예외가 발생하면 처리하겟다 라는 의미
             GlobalTrappicMessage.message(e); // 출력
             System.out.println("현재신호 : " + e.getMessage()); //출력하는게 없으니, 계속 반복될 뿐. 어차피, exception으로 문구를 썼으니, exception에 출력을 넣을 것.
         }


        }

    }

}
