//package lecture.section01.syncronization;
//
//public class Application {
//
//    //상호배제.
//    //임계영역.
//    public static void main(String[] args) {
//
//        //Account account = new Account();
//
//        SafeAccount account = new SafeAccount();
//
//        Thread t1 = Thread(new Runnable() {
//            @Override
//            public void run() {
//                account.withdraw(300);
//            }
//        );
//
//        Thread t2 = Thread(new Runnable() {
//            @Override
//            public void run() {
//                account.withdraw(300);
//            }
//        } );
//
//        t1.start();
//        t2.start();
//
//        {
//
//        }
//
//
//
//    }
//
//}
