package exercise.problem05;

import java.util.Scanner;

public class Application01 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수");
        int numOne = sc.nextInt();

        System.out.println("두번째 정수");
        int numTwo = sc.nextInt();


        System.out.println(

                """
                        덧셈 : 1번
                        뺄셈 : 2번
                        곱셈 : 3번
                        나눗셈 : 4번
                        
                        숫자를 입력해주세요.
                        
                        """

        );


        int num = sc.nextInt();
        sc.nextLine();

        while (true) {


            if (num == 1) {
                System.out.println("numOne + numTwo" + numOne + numTwo);

                break;

            } else if (num == 2) {
                System.out.println(numOne + "+" +  numTwo + (numOne - numTwo));
                break;
            } else if (num == 3) {
                System.out.println(numOne + "*" + numTwo + (numOne * numTwo));
                break;
            } else {
                System.out.println(numOne + "/" + numTwo  + "=" + (numOne / numTwo));
                break;
            }
        }






    }








}
