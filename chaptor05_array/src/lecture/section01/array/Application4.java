package lecture.section01.array;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

    String[] shapes = {"SPADE", "CLOVER", "HEAR", "DIAMOND"};
    String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        System.out.println("spade :" + shapes[0]);


        // Math 난수 발생시키는 random() 뽑은 카드 출력해보시오.

        int shaRaise = (int)(Math.random()*shapes.length);
        int carRaise = (int)(Math.random()*shapes.length);

        //당신이 뽑은 카드는 """ 카드 입니다.

        System.out.println("당신이 뽑은 카드는 " + shapes[shaRaise] + " " + cardNumbers[carRaise] + "입니다");


        //랜덤 주사위 표춘쿠기 굴리기.

        Scanner sc = new Scanner(System.in);

        String[] luck = {"오늘 하루는 행복", "잠을 푹 자야할 듯", "물 많이 마실 것", "공부하기", "운동", "게임"};
        int[] dice = {1, 2, 3, 4, 5, 6};

        int luckTrue = (int) (Math.random() * luck.length);
        int diceTrue = (int) (Math.random() * dice.length);

        //출력은
        // 1번, 오늘의 표춘쿠키는 """'입니다.

        System.out.println("마음에 드는 번호 1~6번 중에서 골라보세요");
        String bunho = sc. nextLine();

        System.out.println(bunho + "번" + luck[luckTrue]);

    }

}
