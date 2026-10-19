package lecture.section01.sync_async;

public class Application {

    public static void main(String[] args) {

        //I/O 대기. 시간이 있는 다운ㅇ로드 같은 작업에서는 스레드를 늘리면 좋다.(비동기로)
        //내 컴퓨터에서 작업을 많이 할 경우(연산작업) -> 코어 수가 정해져있어서 스레드를 많이 돌려도 빨라지진 않음(16개)

        //자바에서는 스레드를 관리하는 스레드풀이 있음.

        System.out.println("==동기방식==");

        //시작시간을 측정.

        long syncStart = System.currentTimeMillis();
        //System.out.println(syncStart); //시간

        FileDownload.downloadSync("문서.pdf", 2000);
        FileDownload.downloadSync("사진.jpg", 1500);
        FileDownload.downloadSync("영상.mp4", 4000);

        long syncEnd = System.currentTimeMillis(); //현재시간을 밀리초로 변환.



        long syncTotal = syncEnd - syncStart;
        System.out.println("토탈" + syncTotal);



        System.out.println("==비동기방식==");

        //시작시간을 측정.

        long asyncStart = System.currentTimeMillis();
        //System.out.println(syncStart); //시간

        Thread t1 = FileDownload.downloadAsync("문서.pdf", 2000);
        Thread t2 =  FileDownload.downloadAsync("사진.jpg", 1500);
        Thread t3 =  FileDownload.downloadAsync("영상.mp4", 4000);

        //비동기는 대기시킬 수 있음??
        //join 메서드(): 스레드가 끝날 때까지 main을 대기시키는.
        //현재 비동기다 보니 메인이 먼저 보냄.

//        t1.join();
//        t2.join();
//        t3.join();

        long asyncEnd = System.currentTimeMillis(); //현재시간을 밀리초로 변환.



        long asyncTotal = asyncEnd - asyncStart;
        System.out.println("비동기 총 소요시간" + asyncTotal);

    }

}
