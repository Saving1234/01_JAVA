package lecture.problemLv3.two;

public class Application {


    public static void main(String[] args) {

        Worker[] workers = new Worker[2];
        workers[0] = new Developer();
        workers[1] = new Designer();

        // 향상된 for문
        for (Worker worker : workers) {
            worker.work();
        }

    }

}
