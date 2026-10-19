package problem;

public class Yangsu {

    //양수//

    //public static int number(int x){


    //짝수/ 홀수

    public static int numbers(int x) {

        if (x % 2 == 0) {
            System.out.println("짝수다");
        } else {
            System.out.println("홀수다");
        }
        return x;
    }

    //1~10까지의 합//

    public static int sum(int x) {

        int i = 0;
        int result = 0;
        for (i = x; i <= 5; i++) {
            result += i;
            System.out.println(result);

        }
        return result;
    }

    //1~10까지 정수의 합//

    public static int evenNumber() {

        int i = 0;

        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int nums = i;

        System.out.println(i);

      return i;
    }

}
