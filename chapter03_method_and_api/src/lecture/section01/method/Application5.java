package lecture.section01.method;

public class Application5 {

    public static void main(String[] args) {

        Application5 app5 = new Application5();

        int result = app5.plus(5, 7);
        System.out.println("덧셈: " + result);

        System.out.println("뺄셈 :" + app5.minus(10,3));
        System.out.println("곱셈 :" + app5.gob(10,3));
        System.out.println("나눗셈 :" + app5.nanugi(10,123));

    }


    // 두 수를 받아 더하는 메소드
    // 두 수를 받아 빼는 메소드
    // 두 수를 받아 곱하는 메소드
    // 두 수를 받아 나누는(몫) 메소드


    public int plus(int x, int y) {

        return x+y;

    }


    public int minus(int x, int y) {

        return x-y;

    }


    public int gob(int x, int y) {

        return x*y;

    }


    public double nanugi(int x, int y) {

        return x/y;

    }

}
