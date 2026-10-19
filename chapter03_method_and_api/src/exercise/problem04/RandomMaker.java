package exercise.problem04;

import java.lang.*;

public class RandomMaker {

    public static int generae() {

       int num = (int) (java.lang.Math.random() * 100);


        return num;
}
    public static int generateInRange(int min, int max){

            // 0~1
            // 0.xxxxx
            // xx.xxxxxx
            // 99 - 50
            // 00 -50 = -50 -> abs => 50
            int num = (int)  ((Math.random() * (max -min))); //*10 이건 범위. 0~9개를 랜덤으로 뽑겠다.
            int num1 = Math.abs(num) + min;

        System.out.println("1번: " + (max-min));
        System.out.println(Math.random() * max -min);
        System.out.println("2번: " + num1);
        //System.out.println(num1);


              return num1;



   }

}

