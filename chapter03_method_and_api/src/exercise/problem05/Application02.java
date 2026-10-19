package exercise.problem05;

import java.util.Scanner;

public class Application02 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //나이 입력
        System.out.println("나이 몇 살?");
        int age = sc.nextInt();
        sc.nextLine();


        //이름 입력
        System.out.println("이름은 무엇인가요?");
        String name = sc.nextLine();

        //좋아하는 색깔 입력
        System.out.println("좋아하는 색 하나만 적어주세요.");
        String color = sc.nextLine();

        //출력

        System.out.println("나이 : " + age );
        System.out.println("이름  : " + name);
        System.out.println("좋아하는 색 : " + color);
    }


    }




