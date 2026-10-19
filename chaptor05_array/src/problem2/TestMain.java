package problem2;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {

        Application app = new Application();

        Scanner sc = new Scanner(System.in);

       // app.intResult(1,2,3,4,5,6);

        app.evenResult(1,2,3);

        app.evenResult2(10,20,30);
        app.evenResult3(10,20,30);
        app.evenResult4();
    }

}
